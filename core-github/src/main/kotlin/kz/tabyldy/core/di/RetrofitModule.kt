package kz.tabyldy.core.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import kz.tabyldy.core.api.AuthGitHubAPI
import kz.tabyldy.core.interceptors.KeyInterceptor
import kz.tabyldy.core.storage.KeyValueStorage
import kz.tabyldy.core.utils.asConverterFactory
import okhttp3.ConnectionPool
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    private const val BASE_URL = "https://api.github.com"

    @Provides
    @Singleton
    fun provideOkHttpClient(interceptor: KeyInterceptor): OkHttpClient {
        val http = HttpLoggingInterceptor()
        http.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .connectionPool(ConnectionPool(0, 5, TimeUnit.MINUTES))
            .protocols(listOf(Protocol.HTTP_1_1))
            .addNetworkInterceptor(interceptor)
            .addNetworkInterceptor(http)
            .build()

    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, converterFactory: Converter.Factory): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(converterFactory)
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthService(retrofit: Retrofit): AuthGitHubAPI {
        return retrofit.create()
    }

    @Provides
    @Singleton
    fun provideType(): MediaType {
        return "application/json".toMediaType()
    }


    @Provides
    @SuppressWarnings()
    @Singleton
    fun provideConverterFactory(mediaType: MediaType): Converter.Factory {
        return Json { ignoreUnknownKeys = true }.asConverterFactory(mediaType)
    }

    @Provides
    @Singleton
    fun getInterceptor(keyValueStorage: KeyValueStorage): KeyInterceptor {
        return KeyInterceptor(keyValueStorage)
    }

}


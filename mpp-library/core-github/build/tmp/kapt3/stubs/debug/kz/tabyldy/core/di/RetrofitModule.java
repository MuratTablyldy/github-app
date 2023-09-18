package kz.tabyldy.core.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kz.tabyldy.core.api.AuthGitHubAPI;
import kz.tabyldy.core.interceptors.KeyInterceptor;
import kz.tabyldy.core.storage.KeyValueStorage;
import okhttp3.ConnectionPool;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0007J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0007J\b\u0010\u0017\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lkz/tabyldy/core/di/RetrofitModule;", "", "()V", "BASE_URL", "", "getInterceptor", "Lkz/tabyldy/core/interceptors/KeyInterceptor;", "keyValueStorage", "Lkz/tabyldy/core/storage/KeyValueStorage;", "provideAuthService", "Lkz/tabyldy/core/api/AuthGitHubAPI;", "retrofit", "Lretrofit2/Retrofit;", "provideConverterFactory", "Lretrofit2/Converter$Factory;", "mediaType", "Lokhttp3/MediaType;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "interceptor", "provideRetrofit", "okHttpClient", "converterFactory", "provideType", "core-github_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RetrofitModule {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://api.github.com";
    @org.jetbrains.annotations.NotNull
    public static final kz.tabyldy.core.di.RetrofitModule INSTANCE = null;
    
    private RetrofitModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.interceptors.KeyInterceptor interceptor) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    retrofit2.Converter.Factory converterFactory) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final kz.tabyldy.core.api.AuthGitHubAPI provideAuthService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.MediaType provideType() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Converter.Factory provideConverterFactory(@org.jetbrains.annotations.NotNull
    okhttp3.MediaType mediaType) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final kz.tabyldy.core.interceptors.KeyInterceptor getInterceptor(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.storage.KeyValueStorage keyValueStorage) {
        return null;
    }
}
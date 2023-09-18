package kz.tabyldy.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RetrofitModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<Converter.Factory> converterFactoryProvider;

  public RetrofitModule_ProvideRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<Converter.Factory> converterFactoryProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.converterFactoryProvider = converterFactoryProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(okHttpClientProvider.get(), converterFactoryProvider.get());
  }

  public static RetrofitModule_ProvideRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Converter.Factory> converterFactoryProvider) {
    return new RetrofitModule_ProvideRetrofitFactory(okHttpClientProvider, converterFactoryProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient okHttpClient,
      Converter.Factory converterFactory) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideRetrofit(okHttpClient, converterFactory));
  }
}

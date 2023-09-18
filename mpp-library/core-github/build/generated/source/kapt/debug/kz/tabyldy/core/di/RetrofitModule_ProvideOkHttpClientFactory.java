package kz.tabyldy.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.tabyldy.core.interceptors.KeyInterceptor;
import okhttp3.OkHttpClient;

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
public final class RetrofitModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<KeyInterceptor> interceptorProvider;

  public RetrofitModule_ProvideOkHttpClientFactory(Provider<KeyInterceptor> interceptorProvider) {
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(interceptorProvider.get());
  }

  public static RetrofitModule_ProvideOkHttpClientFactory create(
      Provider<KeyInterceptor> interceptorProvider) {
    return new RetrofitModule_ProvideOkHttpClientFactory(interceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(KeyInterceptor interceptor) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideOkHttpClient(interceptor));
  }
}

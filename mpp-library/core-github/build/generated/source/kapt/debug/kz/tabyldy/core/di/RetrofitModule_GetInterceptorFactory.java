package kz.tabyldy.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.tabyldy.core.interceptors.KeyInterceptor;
import kz.tabyldy.core.storage.KeyValueStorage;

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
public final class RetrofitModule_GetInterceptorFactory implements Factory<KeyInterceptor> {
  private final Provider<KeyValueStorage> keyValueStorageProvider;

  public RetrofitModule_GetInterceptorFactory(Provider<KeyValueStorage> keyValueStorageProvider) {
    this.keyValueStorageProvider = keyValueStorageProvider;
  }

  @Override
  public KeyInterceptor get() {
    return getInterceptor(keyValueStorageProvider.get());
  }

  public static RetrofitModule_GetInterceptorFactory create(
      Provider<KeyValueStorage> keyValueStorageProvider) {
    return new RetrofitModule_GetInterceptorFactory(keyValueStorageProvider);
  }

  public static KeyInterceptor getInterceptor(KeyValueStorage keyValueStorage) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.getInterceptor(keyValueStorage));
  }
}

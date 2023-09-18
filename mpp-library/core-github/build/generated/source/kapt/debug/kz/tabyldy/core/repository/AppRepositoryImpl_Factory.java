package kz.tabyldy.core.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.tabyldy.core.api.AuthGitHubAPI;
import kz.tabyldy.core.storage.KeyValueStorage;

@ScopeMetadata
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
public final class AppRepositoryImpl_Factory implements Factory<AppRepositoryImpl> {
  private final Provider<AuthGitHubAPI> serviceProvider;

  private final Provider<KeyValueStorage> keyValueStorageProvider;

  public AppRepositoryImpl_Factory(Provider<AuthGitHubAPI> serviceProvider,
      Provider<KeyValueStorage> keyValueStorageProvider) {
    this.serviceProvider = serviceProvider;
    this.keyValueStorageProvider = keyValueStorageProvider;
  }

  @Override
  public AppRepositoryImpl get() {
    return newInstance(serviceProvider.get(), keyValueStorageProvider.get());
  }

  public static AppRepositoryImpl_Factory create(Provider<AuthGitHubAPI> serviceProvider,
      Provider<KeyValueStorage> keyValueStorageProvider) {
    return new AppRepositoryImpl_Factory(serviceProvider, keyValueStorageProvider);
  }

  public static AppRepositoryImpl newInstance(AuthGitHubAPI service,
      KeyValueStorage keyValueStorage) {
    return new AppRepositoryImpl(service, keyValueStorage);
  }
}

package kz.tabyldy.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.tabyldy.core.api.AuthGitHubAPI;
import kz.tabyldy.core.repository.AppRepository;
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
public final class ServiceModule_GetAppReposFactory implements Factory<AppRepository> {
  private final Provider<AuthGitHubAPI> serviceProvider;

  private final Provider<KeyValueStorage> keyValueStorageProvider;

  public ServiceModule_GetAppReposFactory(Provider<AuthGitHubAPI> serviceProvider,
      Provider<KeyValueStorage> keyValueStorageProvider) {
    this.serviceProvider = serviceProvider;
    this.keyValueStorageProvider = keyValueStorageProvider;
  }

  @Override
  public AppRepository get() {
    return getAppRepos(serviceProvider.get(), keyValueStorageProvider.get());
  }

  public static ServiceModule_GetAppReposFactory create(Provider<AuthGitHubAPI> serviceProvider,
      Provider<KeyValueStorage> keyValueStorageProvider) {
    return new ServiceModule_GetAppReposFactory(serviceProvider, keyValueStorageProvider);
  }

  public static AppRepository getAppRepos(AuthGitHubAPI service, KeyValueStorage keyValueStorage) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.getAppRepos(service, keyValueStorage));
  }
}

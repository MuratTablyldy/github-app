package kz.tabyldy.core.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.tabyldy.core.repository.AppRepository;

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
public final class GitHubInteractor_Factory implements Factory<GitHubInteractor> {
  private final Provider<AppRepository> repositoryProvider;

  public GitHubInteractor_Factory(Provider<AppRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GitHubInteractor get() {
    return newInstance(repositoryProvider.get());
  }

  public static GitHubInteractor_Factory create(Provider<AppRepository> repositoryProvider) {
    return new GitHubInteractor_Factory(repositoryProvider);
  }

  public static GitHubInteractor newInstance(AppRepository repository) {
    return new GitHubInteractor(repository);
  }
}

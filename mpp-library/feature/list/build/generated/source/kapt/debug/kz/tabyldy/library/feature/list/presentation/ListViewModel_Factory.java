package kz.tabyldy.library.feature.list.presentation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kz.tabyldy.core.usecase.GitHubUseCase;

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
public final class ListViewModel_Factory implements Factory<ListViewModel> {
  private final Provider<GitHubUseCase> useCaseProvider;

  public ListViewModel_Factory(Provider<GitHubUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public ListViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static ListViewModel_Factory create(Provider<GitHubUseCase> useCaseProvider) {
    return new ListViewModel_Factory(useCaseProvider);
  }

  public static ListViewModel newInstance(GitHubUseCase useCase) {
    return new ListViewModel(useCase);
  }
}

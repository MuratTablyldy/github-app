package kz.tabyldy.library.feature.list.presentation;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ListFragment_MembersInjector implements MembersInjector<ListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ListFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ListFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("kz.tabyldy.library.feature.list.presentation.ListFragment.viewModelFactory")
  public static void injectViewModelFactory(ListFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}

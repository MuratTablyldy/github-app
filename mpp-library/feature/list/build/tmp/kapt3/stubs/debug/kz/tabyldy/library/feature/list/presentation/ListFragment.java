package kz.tabyldy.library.feature.list.presentation;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\u0016H\u0002J&\u0010#\u001a\u00020\u00162\b\b\u0001\u0010$\u001a\u00020%2\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006)"}, d2 = {"Lkz/tabyldy/library/feature/list/presentation/ListFragment;", "Lkz/tabyldy/core/base/BaseFragment;", "Lkz/tabyldy/library/feature/list/databinding/ListFragmentLayoutBinding;", "()V", "adapter", "Lkz/tabyldy/library/feature/list/adapters/ReposAdapter;", "getAdapter", "()Lkz/tabyldy/library/feature/list/adapters/ReposAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lkz/tabyldy/library/feature/list/presentation/ListViewModel;", "getViewModel", "()Lkz/tabyldy/library/feature/list/presentation/ListViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "bind", "", "hideAllViews", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showEmptyView", "showErrorView", "iconId", "", "errorHeader", "errorMessage", "showLoadingView", "list_debug"})
public final class ListFragment extends kz.tabyldy.core.base.BaseFragment<kz.tabyldy.library.feature.list.databinding.ListFragmentLayoutBinding> {
    @javax.inject.Inject
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy adapter$delegate = null;
    
    public ListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final kz.tabyldy.library.feature.list.presentation.ListViewModel getViewModel() {
        return null;
    }
    
    private final kz.tabyldy.library.feature.list.adapters.ReposAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bind() {
    }
    
    private final void showLoadingView() {
    }
    
    private final void showErrorView(@androidx.annotation.DrawableRes
    int iconId, @androidx.annotation.StringRes
    int errorHeader, @androidx.annotation.StringRes
    int errorMessage) {
    }
    
    private final void hideAllViews() {
    }
    
    private final void showEmptyView() {
    }
}
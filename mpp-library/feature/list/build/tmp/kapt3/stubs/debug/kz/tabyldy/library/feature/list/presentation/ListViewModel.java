package kz.tabyldy.library.feature.list.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lkz/tabyldy/library/feature/list/presentation/ListViewModel;", "Ldev/icerock/moko/mvvm/viewmodel/ViewModel;", "useCase", "Lkz/tabyldy/core/usecase/GitHubUseCase;", "(Lkz/tabyldy/core/usecase/GitHubUseCase;)V", "mutableState", "Ldev/icerock/moko/mvvm/livedata/MutableLiveData;", "Lkz/tabyldy/library/feature/list/model/State;", "state", "Ldev/icerock/moko/mvvm/livedata/LiveData;", "getState", "()Ldev/icerock/moko/mvvm/livedata/LiveData;", "loadRepositories", "", "onCreated", "onRetryPressed", "list_debug"})
public final class ListViewModel extends dev.icerock.moko.mvvm.viewmodel.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kz.tabyldy.core.usecase.GitHubUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final dev.icerock.moko.mvvm.livedata.MutableLiveData<kz.tabyldy.library.feature.list.model.State> mutableState = null;
    
    @javax.inject.Inject
    public ListViewModel(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.usecase.GitHubUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.icerock.moko.mvvm.livedata.LiveData<kz.tabyldy.library.feature.list.model.State> getState() {
        return null;
    }
    
    private final void loadRepositories() {
    }
    
    public final void onCreated() {
    }
    
    public final void onRetryPressed() {
    }
}
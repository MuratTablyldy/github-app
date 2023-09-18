package kz.tabyldy.library.feature.list.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lkz/tabyldy/library/feature/list/model/ListSource;", "T", "", "getList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list_debug"})
public abstract interface ListSource<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends T>> $completion);
}
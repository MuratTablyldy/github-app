package kz.tabyldy.core.utils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B]\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012:\u0010\b\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00018\u0001\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00020\t\u00a2\u0006\u0002\u0010\u000eJ,\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0003\u0010\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00062\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0003\u0010\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0016RB\u0010\b\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00018\u0001\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\r\u001a\u0004\u0018\u00018\u0001X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lkz/tabyldy/core/utils/CombinedLiveData;", "T", "K", "S", "Landroidx/lifecycle/MediatorLiveData;", "source1", "Landroidx/lifecycle/LiveData;", "source2", "combine", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data1", "data2", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function2;)V", "Ljava/lang/Object;", "addSource", "", "source", "onChanged", "Landroidx/lifecycle/Observer;", "removeSource", "toRemote", "core-github_debug"})
public final class CombinedLiveData<T extends java.lang.Object, K extends java.lang.Object, S extends java.lang.Object> extends androidx.lifecycle.MediatorLiveData<S> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<T, K, S> combine = null;
    @org.jetbrains.annotations.Nullable
    private T data1;
    @org.jetbrains.annotations.Nullable
    private K data2;
    
    public CombinedLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> source1, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<K> source2, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super T, ? super K, ? extends S> combine) {
        super();
    }
    
    @java.lang.Override
    public <T extends java.lang.Object>void addSource(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> source, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Observer<? super T> onChanged) {
    }
    
    @java.lang.Override
    public <T extends java.lang.Object>void removeSource(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> toRemote) {
    }
}
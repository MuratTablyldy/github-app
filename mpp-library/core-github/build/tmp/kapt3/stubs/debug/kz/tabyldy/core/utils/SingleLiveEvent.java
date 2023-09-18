package kz.tabyldy.core.utils;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0010B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0007J \u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000eH\u0017J\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lkz/tabyldy/core/utils/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "t", "(Ljava/lang/Object;)V", "()V", "mPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "call", "", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", "Companion", "core-github_debug"})
public final class SingleLiveEvent<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<T> {
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean mPending = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "SingleLiveEvent";
    @org.jetbrains.annotations.NotNull
    public static final kz.tabyldy.core.utils.SingleLiveEvent.Companion Companion = null;
    
    public SingleLiveEvent(T t) {
        super(null);
    }
    
    public SingleLiveEvent() {
        super(null);
    }
    
    @java.lang.Override
    @androidx.annotation.MainThread
    public void observe(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Observer<? super T> observer) {
    }
    
    @java.lang.Override
    @androidx.annotation.MainThread
    public void setValue(@org.jetbrains.annotations.Nullable
    T t) {
    }
    
    @androidx.annotation.MainThread
    public final void call() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lkz/tabyldy/core/utils/SingleLiveEvent$Companion;", "", "()V", "TAG", "", "core-github_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package kz.tabyldy.core.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lkz/tabyldy/core/base/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "get_binding", "()Landroidx/viewbinding/ViewBinding;", "set_binding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "core-github_debug"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private VB _binding;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final VB get_binding() {
        return null;
    }
    
    protected final void set_binding(@org.jetbrains.annotations.Nullable
    VB p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final VB getBinding() {
        return null;
    }
}
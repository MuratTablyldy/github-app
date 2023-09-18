package kz.tabyldy.library.feature.list.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lkz/tabyldy/library/feature/list/adapters/ReposAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lkz/tabyldy/library/feature/list/adapters/ReposAdapter$MViewHolder;", "onClick", "Lkotlin/Function1;", "Lkz/tabyldy/core/model/Repo;", "", "(Lkotlin/jvm/functions/Function1;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setList", "list", "", "DiffUtilCallBack", "MViewHolder", "list_debug"})
public final class ReposAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<kz.tabyldy.library.feature.list.adapters.ReposAdapter.MViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kz.tabyldy.core.model.Repo, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<kz.tabyldy.core.model.Repo> differ = null;
    
    public ReposAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kz.tabyldy.core.model.Repo, kotlin.Unit> onClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<kz.tabyldy.core.model.Repo, kotlin.Unit> getOnClick() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kz.tabyldy.library.feature.list.adapters.ReposAdapter.MViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    kz.tabyldy.library.feature.list.adapters.ReposAdapter.MViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.List<kz.tabyldy.core.model.Repo> list) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lkz/tabyldy/library/feature/list/adapters/ReposAdapter$DiffUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lkz/tabyldy/core/model/Repo;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "list_debug"})
    public static final class DiffUtilCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<kz.tabyldy.core.model.Repo> {
        
        public DiffUtilCallBack() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        kz.tabyldy.core.model.Repo oldItem, @org.jetbrains.annotations.NotNull
        kz.tabyldy.core.model.Repo newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        kz.tabyldy.core.model.Repo oldItem, @org.jetbrains.annotations.NotNull
        kz.tabyldy.core.model.Repo newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lkz/tabyldy/library/feature/list/adapters/ReposAdapter$MViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lkz/tabyldy/library/feature/list/databinding/RepositoryRowBinding;", "(Lkz/tabyldy/library/feature/list/databinding/RepositoryRowBinding;)V", "getItemBinding", "()Lkz/tabyldy/library/feature/list/databinding/RepositoryRowBinding;", "list_debug"})
    public static final class MViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final kz.tabyldy.library.feature.list.databinding.RepositoryRowBinding itemBinding = null;
        
        public MViewHolder(@org.jetbrains.annotations.NotNull
        kz.tabyldy.library.feature.list.databinding.RepositoryRowBinding itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final kz.tabyldy.library.feature.list.databinding.RepositoryRowBinding getItemBinding() {
            return null;
        }
    }
}
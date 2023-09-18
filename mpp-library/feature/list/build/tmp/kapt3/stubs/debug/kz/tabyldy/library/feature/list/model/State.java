package kz.tabyldy.library.feature.list.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lkz/tabyldy/library/feature/list/model/State;", "", "Empty", "Error", "Loaded", "Loading", "Lkz/tabyldy/library/feature/list/model/State$Empty;", "Lkz/tabyldy/library/feature/list/model/State$Error;", "Lkz/tabyldy/library/feature/list/model/State$Loaded;", "Lkz/tabyldy/library/feature/list/model/State$Loading;", "list_debug"})
public abstract interface State {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkz/tabyldy/library/feature/list/model/State$Empty;", "Lkz/tabyldy/library/feature/list/model/State;", "()V", "list_debug"})
    public static final class Empty implements kz.tabyldy.library.feature.list.model.State {
        @org.jetbrains.annotations.NotNull
        public static final kz.tabyldy.library.feature.list.model.State.Empty INSTANCE = null;
        
        private Empty() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lkz/tabyldy/library/feature/list/model/State$Error;", "Lkz/tabyldy/library/feature/list/model/State;", "error", "", "(I)V", "getError", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "list_debug"})
    public static final class Error implements kz.tabyldy.library.feature.list.model.State {
        private final int error = 0;
        
        public Error(@androidx.annotation.StringRes
        int error) {
            super();
        }
        
        public final int getError() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kz.tabyldy.library.feature.list.model.State.Error copy(@androidx.annotation.StringRes
        int error) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lkz/tabyldy/library/feature/list/model/State$Loaded;", "Lkz/tabyldy/library/feature/list/model/State;", "repos", "", "Lkz/tabyldy/core/model/Repo;", "(Ljava/util/List;)V", "getRepos", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "list_debug"})
    public static final class Loaded implements kz.tabyldy.library.feature.list.model.State {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<kz.tabyldy.core.model.Repo> repos = null;
        
        public Loaded(@org.jetbrains.annotations.NotNull
        java.util.List<kz.tabyldy.core.model.Repo> repos) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<kz.tabyldy.core.model.Repo> getRepos() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<kz.tabyldy.core.model.Repo> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kz.tabyldy.library.feature.list.model.State.Loaded copy(@org.jetbrains.annotations.NotNull
        java.util.List<kz.tabyldy.core.model.Repo> repos) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkz/tabyldy/library/feature/list/model/State$Loading;", "Lkz/tabyldy/library/feature/list/model/State;", "()V", "list_debug"})
    public static final class Loading implements kz.tabyldy.library.feature.list.model.State {
        @org.jetbrains.annotations.NotNull
        public static final kz.tabyldy.library.feature.list.model.State.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}
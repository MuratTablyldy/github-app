package kz.tabyldy.core.interceptors;

import okhttp3.Interceptor;
import okhttp3.Response;
import kz.tabyldy.core.storage.KeyValueStorage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lkz/tabyldy/core/interceptors/KeyInterceptor;", "Lokhttp3/Interceptor;", "keyValueStorage", "Lkz/tabyldy/core/storage/KeyValueStorage;", "(Lkz/tabyldy/core/storage/KeyValueStorage;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "core-github_debug"})
public final class KeyInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull
    private final kz.tabyldy.core.storage.KeyValueStorage keyValueStorage = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VERSION_HEADER_NAME = "X-GitHub-Api-Version";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VERSION = "2022-11-28";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACCEPT_HEADER_NAME = "Accept";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACCEPT_TYPE = "application/vnd.github+json";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUTHORIZATION_HEADER = "Authorization";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TYPE = "Bearer";
    @org.jetbrains.annotations.NotNull
    public static final kz.tabyldy.core.interceptors.KeyInterceptor.Companion Companion = null;
    
    public KeyInterceptor(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.storage.KeyValueStorage keyValueStorage) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lkz/tabyldy/core/interceptors/KeyInterceptor$Companion;", "", "()V", "ACCEPT_HEADER_NAME", "", "ACCEPT_TYPE", "AUTHORIZATION_HEADER", "TYPE", "VERSION", "VERSION_HEADER_NAME", "core-github_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
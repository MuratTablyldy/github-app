package kz.tabyldy.core.storage;

import com.russhwolf.settings.Settings;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lkz/tabyldy/core/storage/KeyValueStorage;", "", "settings", "Lcom/russhwolf/settings/Settings;", "(Lcom/russhwolf/settings/Settings;)V", "<set-?>", "", "accessToken", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "accessToken$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "isValid", "()Ljava/lang/Boolean;", "setValid", "(Ljava/lang/Boolean;)V", "isValid$delegate", "Companion", "core-github_debug"})
public final class KeyValueStorage {
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadWriteProperty accessToken$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadWriteProperty isValid$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACCESS_TOKEN = "access_token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_VALID = "is_valid";
    @org.jetbrains.annotations.NotNull
    public static final kz.tabyldy.core.storage.KeyValueStorage.Companion Companion = null;
    
    @javax.inject.Inject
    public KeyValueStorage(@org.jetbrains.annotations.NotNull
    com.russhwolf.settings.Settings settings) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isValid() {
        return null;
    }
    
    public final void setValid(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lkz/tabyldy/core/storage/KeyValueStorage$Companion;", "", "()V", "ACCESS_TOKEN", "", "IS_VALID", "core-github_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
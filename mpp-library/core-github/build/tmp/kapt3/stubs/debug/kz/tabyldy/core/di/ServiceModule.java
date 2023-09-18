package kz.tabyldy.core.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kz.tabyldy.core.repository.AppRepository;
import kz.tabyldy.core.repository.AppRepositoryImpl;
import kz.tabyldy.core.api.AuthGitHubAPI;
import kz.tabyldy.core.storage.KeyValueStorage;

@dagger.Module(includes = {kz.tabyldy.core.di.RetrofitModule.class, kz.tabyldy.core.di.KeyValueStorageModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lkz/tabyldy/core/di/ServiceModule;", "", "()V", "getAppRepos", "Lkz/tabyldy/core/repository/AppRepository;", "service", "Lkz/tabyldy/core/api/AuthGitHubAPI;", "keyValueStorage", "Lkz/tabyldy/core/storage/KeyValueStorage;", "core-github_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ServiceModule {
    @org.jetbrains.annotations.NotNull
    public static final kz.tabyldy.core.di.ServiceModule INSTANCE = null;
    
    private ServiceModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final kz.tabyldy.core.repository.AppRepository getAppRepos(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.api.AuthGitHubAPI service, @org.jetbrains.annotations.NotNull
    kz.tabyldy.core.storage.KeyValueStorage keyValueStorage) {
        return null;
    }
}
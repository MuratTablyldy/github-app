package kz.tabyldy.core.di;

import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import kz.tabyldy.core.factory.ViewModelFactory;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lkz/tabyldy/core/di/ViewModelFactoryModule;", "", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lkz/tabyldy/core/factory/ViewModelFactory;", "core-github_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
public abstract interface ViewModelFactoryModule {
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.factory.ViewModelFactory factory);
}
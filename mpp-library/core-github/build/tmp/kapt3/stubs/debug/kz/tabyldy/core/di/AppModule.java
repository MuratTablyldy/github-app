package kz.tabyldy.core.di;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kz.tabyldy.core.usecase.GitHubInteractor;
import kz.tabyldy.core.usecase.GitHubUseCase;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lkz/tabyldy/core/di/AppModule;", "", "provideMovieUseCase", "Lkz/tabyldy/core/usecase/GitHubUseCase;", "gitHubInteractor", "Lkz/tabyldy/core/usecase/GitHubInteractor;", "core-github_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface AppModule {
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract kz.tabyldy.core.usecase.GitHubUseCase provideMovieUseCase(@org.jetbrains.annotations.NotNull
    kz.tabyldy.core.usecase.GitHubInteractor gitHubInteractor);
}
package kz.tabyldy.core.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kz.tabyldy.core.usecase.GitHubInteractor
import kz.tabyldy.core.usecase.GitHubUseCase

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {
    @Binds
    abstract fun provideMovieUseCase(gitHubInteractor: GitHubInteractor): GitHubUseCase
}
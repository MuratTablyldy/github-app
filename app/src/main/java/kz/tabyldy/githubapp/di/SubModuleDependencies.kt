package kz.tabyldy.githubapp.di

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kz.tabyldy.core.storage.KeyValueStorage
import kz.tabyldy.core.usecase.GitHubUseCase

@EntryPoint
@InstallIn(SingletonComponent::class)
interface SubModuleDependencies {
    fun provideMovieUseCase(): GitHubUseCase
    fun providePrefs(): KeyValueStorage
}

package kz.tabyldy.provider.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kz.tabyldy.coreapi.storage.KeyValueStorage
import kz.tabyldy.core.storage.KeyValueStorageImpl
import kz.tabyldy.core.usecase.GitHubInteractor
import kz.tabyldy.coreapi.usecase.GitHubUseCase

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {

    @Binds
    fun provideMovieUseCase(gitHubInteractor: GitHubInteractor): GitHubUseCase

    @Binds
    fun provideKeyValueStorage(keyValueStorageImpl: KeyValueStorageImpl): KeyValueStorage

}
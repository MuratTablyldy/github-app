package kz.tabyldy.core.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kz.tabyldy.core.repository.AppRepository
import kz.tabyldy.core.repository.AppRepositoryImpl
import kz.tabyldy.core.api.AuthGitHubAPI
import kz.tabyldy.core.storage.KeyValueStorageImpl

@Module(includes = [RetrofitModule::class, KeyValueStorageModule::class])
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Provides
    fun getAppRepos(service: AuthGitHubAPI,
                    keyValueStorageImpl: KeyValueStorageImpl
    ): AppRepository {
        return AppRepositoryImpl(service, keyValueStorageImpl)
    }


}
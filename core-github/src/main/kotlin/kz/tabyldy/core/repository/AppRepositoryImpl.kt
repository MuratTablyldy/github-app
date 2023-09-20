package kz.tabyldy.core.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kz.tabyldy.core.api.AuthGitHubAPI
import kz.tabyldy.core.model.Repo
import kz.tabyldy.core.model.RepoDetail

import kz.tabyldy.core.storage.KeyValueStorage
import javax.inject.Inject


class AppRepositoryImpl @Inject constructor(
    private val service: AuthGitHubAPI,
    private val keyValueStorage: KeyValueStorage
) : AppRepository {

    override var isValid: Boolean?
        get() = keyValueStorage.isValid
        set(value) {
            keyValueStorage.isValid = value
        }

    override var apiToken: String?
        get() = keyValueStorage.accessToken
        set(value) {
            keyValueStorage.accessToken = value
        }

    override suspend fun <T : Any> invoke(
        dispatcher: CoroutineDispatcher,
        apiCall: suspend () -> T
    ): Result<T> {
            return kotlin.runCatching{
                apiCall.invoke()
            }
    }

    override suspend fun checkToken(): Result<Unit> {
        return invoke(Dispatchers.IO) {
            service.checkToken()
        }
    }

    override suspend fun getRepos(): Result<List<Repo>> {
        return invoke(Dispatchers.IO) {
            service.getUserRepos(PER_PAGE)
        }
    }

    override suspend fun getRepositoryReadme(id: Long): Result<String> {
        return invoke(Dispatchers.IO) {
            val data = service.getReadme(id)
            data.url
        }
    }

    override suspend fun getRepository(
        ownerName: String,
        repositoryName: String
    ): Result<RepoDetail> {
        return invoke(Dispatchers.IO) {
            service.getRepoDetails(owner = ownerName, repo = repositoryName)
        }
    }

    companion object {
        const val PER_PAGE = 10
    }


}
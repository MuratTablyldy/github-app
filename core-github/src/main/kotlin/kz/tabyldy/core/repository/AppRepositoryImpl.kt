package kz.tabyldy.core.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kz.tabyldy.core.api.AuthGitHubAPI
import kz.tabyldy.coreapi.storage.KeyValueStorage
import kz.tabyldy.coreapi.model.Repo
import kz.tabyldy.coreapi.model.RepoDetail
import kz.tabyldy.coreapi.exceptions.HttpException
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(
    private val service: AuthGitHubAPI,
    private val keyValueStorage: KeyValueStorage
) : AppRepository {

    companion object {
        const val PER_PAGE = 10
    }

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
        val result = kotlin.runCatching {
            apiCall.invoke()
        }
        if (result.isSuccess) {
            return result
        }
        return when (val exception = result.exceptionOrNull()) {
            is retrofit2.HttpException -> {
                return Result.failure(
                    HttpException(
                        exception.message,
                        exception.code(),
                        exception)
                )
            }

            null -> {
                Result.failure(NullPointerException())
            }

            else -> {
                Result.failure(exception)
            }
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

}
package kz.tabyldy.core.usecase

import kotlinx.coroutines.CoroutineDispatcher
import kz.tabyldy.core.repository.AppRepository

import kz.tabyldy.coreapi.model.Repo
import kz.tabyldy.coreapi.model.RepoDetail
import kz.tabyldy.coreapi.usecase.GitHubUseCase
import javax.inject.Inject

class GitHubInteractor @Inject constructor(private val repository: AppRepository):
    GitHubUseCase {

    override suspend fun <T : Any> invoke(
        dispatcher: CoroutineDispatcher,
        apiCall: suspend () -> T
    ): Result<T> {
        return repository.invoke(dispatcher,apiCall)
    }

    override suspend fun checkToken(): Result<Unit> {
        return repository.checkToken()
    }

    override suspend fun getRepos(): Result<List<Repo>> {
        return repository.getRepos()
    }

    override suspend fun getRepositoryReadme(id: Long): Result<String> {
        return repository.getRepositoryReadme(id)
    }

    override suspend fun getRepository(
        ownerName: String,
        repositoryName: String
    ): Result<RepoDetail> {
        return repository.getRepository(ownerName, repositoryName)
    }

    override fun getApiToken(): String? {
        return repository.apiToken
    }

    override fun setApiTToken(value: String?) {
        repository.apiToken=value
    }

    override fun setValid(valid: Boolean?) {
        repository.isValid=valid
    }

    override fun isValid(): Boolean? {
        return repository.isValid
    }

}
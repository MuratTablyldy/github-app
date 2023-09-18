package kz.tabyldy.core.usecase

import kotlinx.coroutines.CoroutineDispatcher
import kz.tabyldy.core.model.Repo
import kz.tabyldy.core.model.RepoDetail

interface GitHubUseCase {
    suspend fun <T : Any> invoke(
        dispatcher: CoroutineDispatcher,
        apiCall: suspend () -> T
    ): Result<T>

    suspend fun checkToken(): Result<Unit>
    suspend fun getRepos(): Result<List<Repo>>
    suspend fun getRepositoryReadme(
        id: Long
    ): Result<String>

    suspend fun getRepository(
        ownerName: String,
        repositoryName: String
    ): Result<RepoDetail>

    fun getApiToken():String?
    fun setApiTToken(value:String?)

    fun setValid(valid: Boolean?)
    fun isValid():Boolean?

}
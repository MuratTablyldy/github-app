package kz.tabyldy.core.repository

import kotlinx.coroutines.CoroutineDispatcher
import kz.tabyldy.core.model.Repo
import kz.tabyldy.core.model.RepoDetail

interface AppRepository {

    var apiToken: String?

    var isValid: Boolean?

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

}
package kz.tabyldy.core.api

import kz.tabyldy.core.model.MDRes
import kz.tabyldy.core.model.Repo
import kz.tabyldy.core.model.RepoDetail
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface AuthGitHubAPI {

    @GET("/issues")
    suspend fun checkToken()

    @GET("/user/repos")
    suspend fun getUserRepos(
        @Query("per_page") perPage: Int
    ): List<Repo>

    @GET("/repositories/{id}/contents/README.md")
    suspend fun getReadme(
        @Path("id")
        id: Long
    ): MDRes

    @GET("/repos/{owner}/{repo}")
    suspend fun getRepoDetails(
        @Path("owner") owner: String,
        @Path("repo") repo: String
    ): RepoDetail

}
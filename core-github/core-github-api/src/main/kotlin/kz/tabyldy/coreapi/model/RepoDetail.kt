package kz.tabyldy.coreapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RepoDetail(
    @SerialName("id")
    val id: Long,

    @SerialName("license")
    val license: License?,

    @SerialName("forks")
    val forks: Int,

    @SerialName("stargazers_count")
    val stars: Int,

    @SerialName("watchers")
    val watchers: Int,

    @SerialName("default_branch")
    val branch: String,

    @SerialName("html_url")
    val url: String
){
    val htmlUrl:String
    get() = "<a href=\"$url\">$url</a>"
}
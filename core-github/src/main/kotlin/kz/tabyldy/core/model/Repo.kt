package kz.tabyldy.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Repo(
    @SerialName("id")
    val id: Long,

    @SerialName("node_id")
    val nodeId: String,

    @SerialName("name")
    val name: String,

    @SerialName("full_name")
    val fullName: String,

    @SerialName("owner")
    val owner: Owner?,

    @SerialName("description")
    val description: String?,

    @SerialName("private")
    val private: Boolean,

    @SerialName("fork")
    val fork: Boolean,

    @SerialName("languages_url")
    val languagesUrl: String?,

    @SerialName("language")
    val language: String?,

    @SerialName("forks_count")
    val forksCount: Int,

    @SerialName("size")
    val size: Int,

    @SerialName("topics")
    val topics: List<String>
)

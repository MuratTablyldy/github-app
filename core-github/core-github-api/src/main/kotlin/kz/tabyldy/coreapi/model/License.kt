package kz.tabyldy.coreapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class License(
    @SerialName("key")
    val key: String,
    @SerialName("name")
    val name: String
)

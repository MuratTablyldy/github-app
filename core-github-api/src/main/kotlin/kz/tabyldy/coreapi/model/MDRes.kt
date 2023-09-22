package kz.tabyldy.coreapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MDRes(
    @SerialName("download_url")
    val url: String
)
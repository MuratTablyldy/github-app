package kz.tabyldy.core.utils

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.StringFormat
import kz.tabyldy.core.serializer.SerializationFactory
import kz.tabyldy.core.serializer.Serializer
import okhttp3.MediaType
import retrofit2.Converter

@OptIn(ExperimentalSerializationApi::class)
@JvmName("create")
fun StringFormat.asConverterFactory(contentType: MediaType): Converter.Factory {
    return SerializationFactory(contentType, Serializer.FromString(this))
}
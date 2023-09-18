package kz.tabyldy.core.serializer

import kotlinx.serialization.*
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.ResponseBody
import retrofit2.Converter
import java.lang.reflect.Type

sealed class Serializer {

    @OptIn(ExperimentalSerializationApi::class)
    abstract val format: SerialFormat

    abstract fun <T> fromResponseBody(
        loader: DeserializationStrategy<T>,
        body: ResponseBody
    ): T

    abstract fun <T> toRequestBody(
        contentType: okhttp3.MediaType,
        saver: SerializationStrategy<T>,
        value: T
    ): RequestBody

    @OptIn(ExperimentalSerializationApi::class)
    fun serializer(type: Type): KSerializer<Any> = format.serializersModule.serializer(type)

    class FromString  constructor(override val format: StringFormat) : Serializer() {

        @OptIn(ExperimentalSerializationApi::class)
        override fun <T> fromResponseBody(
            loader: DeserializationStrategy<T>,
            body: ResponseBody
        ): T {
            val string = body.string()
            return format.decodeFromString(loader, string)
        }

        @OptIn(ExperimentalSerializationApi::class)
        override fun <T> toRequestBody(
            contentType: okhttp3.MediaType,
            saver: SerializationStrategy<T>,
            value: T
        ): RequestBody {
            val string = format.encodeToString(saver, value)
            return string.toRequestBody(contentType)
        }
    }

    internal class DeserializationStrategyConverter<T>(
        private val loader: DeserializationStrategy<T>,
        private val deserializer: Serializer
    ) : Converter<ResponseBody, T> {
        override fun convert(value: ResponseBody) = deserializer.fromResponseBody(loader, value)
    }

    internal class SerializationStrategyConverter<T>(
        private val contentType: okhttp3.MediaType,
        private val saver: SerializationStrategy<T>,
        private val serializer: Serializer
    ) : Converter<T, RequestBody> {
        override fun convert(value: T) = serializer.toRequestBody(contentType, saver, value)
    }
}
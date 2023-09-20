package kz.tabyldy.core.serializer

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.StringFormat
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Converter.Factory
import retrofit2.Retrofit
import java.lang.reflect.Type

class SerializationFactory(
    private val contentType: MediaType,
    private val serializer: Serializer
) : Factory() {

    override fun requestBodyConverter(
        type: Type,
        parameterAnnotations: Array<out Annotation>,
        methodAnnotations: Array<out Annotation>,
        retrofit: Retrofit
    ): Converter<*, RequestBody> {
        val serial = serializer.serializer(type)
        return Serializer.SerializationStrategyConverter(contentType, serial, serializer)
    }

    override fun responseBodyConverter(
        type: Type,
        annotations: Array<out Annotation>,
        retrofit: Retrofit
    ): Converter<ResponseBody, *> {
        val deserializer = serializer.serializer(type)
        return Serializer.DeserializationStrategyConverter(deserializer, serializer)
    }

}





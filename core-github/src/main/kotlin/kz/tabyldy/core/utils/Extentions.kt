package kz.tabyldy.core.utils

import androidx.lifecycle.LiveData
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.StringFormat
import kz.tabyldy.core.serializer.SerializationFactory
import kz.tabyldy.core.serializer.Serializer
import okhttp3.MediaType
import retrofit2.Converter

fun <T,V,S> mediatorOf(first: LiveData<T>, second: LiveData<V>, onCombine:(T?, V?)->S): CombinedLiveData<T, V, S> {
    return CombinedLiveData(first,second,onCombine)
}

@OptIn(ExperimentalSerializationApi::class)
@JvmName("create")
fun StringFormat.asConverterFactory(contentType: MediaType): Converter.Factory {
    return SerializationFactory(contentType, Serializer.FromString(this))
}
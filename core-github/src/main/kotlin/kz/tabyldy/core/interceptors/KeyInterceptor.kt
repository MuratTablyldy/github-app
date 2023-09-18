package kz.tabyldy.core.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import kz.tabyldy.core.storage.KeyValueStorage


class KeyInterceptor constructor(private val keyValueStorage: KeyValueStorage) : Interceptor {


    override fun intercept(chain: Interceptor.Chain): Response {
        val token = "$TYPE ${keyValueStorage.accessToken}"
        val request=chain.request().newBuilder()
            .addHeader(VERSION_HEADER_NAME, VERSION)
            .addHeader(ACCEPT_HEADER_NAME, ACCEPT_TYPE)
            .addHeader(AUTHORIZATION_HEADER, token)
            .build()

        return chain.proceed(request)
    }

    companion object{
        const val VERSION_HEADER_NAME = "X-GitHub-Api-Version"

        const val VERSION = "2022-11-28"

        const val ACCEPT_HEADER_NAME = "Accept"

        const val ACCEPT_TYPE = "application/vnd.github+json"

        const val AUTHORIZATION_HEADER = "Authorization"

        const val TYPE = "Bearer"
    }
}
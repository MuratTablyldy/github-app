/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package kz.tabyldy.library

/*
import androidx.annotation.StringRes
import io.github.aakira.napier.Antilog
import io.github.aakira.napier.Napier
import com.russhwolf.settings.Settings
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.desc.ResourceFormatted
import dev.icerock.moko.resources.desc.StringDesc
import dev.icerock.moko.resources.desc.desc
import dev.icerock.moko.units.TableUnitItem
import io.ktor.client.engine.HttpClientEngine

import kz.tabyldy.domain.core_github_impl.di.DomainFactory
import kz.tabyldy.library.domain.guthub_api.entity.News
import kz.tabyldy.library.feature.config.di.ConfigFactory
import kz.tabyldy.library.feature.config.model.ConfigStore
import kz.tabyldy.library.feature.config.presentation.ConfigViewModel
import kz.tabyldy.library.feature.list.di.ListFactory
import kz.tabyldy.library.feature.list.model.ListSource
import kz.tabyldy.library.feature.list.presentation.ListViewModel

class SharedFactory(
    settings: Settings,
    antilog: Antilog,
    baseUrl: String,
    newsUnitsFactory: NewsUnitsFactory,
    httpClientEngine: HttpClientEngine?
) {

    private val domainFactory = kz.tabyldy.domain.core_github_impl.di.DomainFactory(
        settings = settings,
        baseUrl = baseUrl,
        httpClientEngine = httpClientEngine
    )

    val newsFactory: ListFactory<kz.tabyldy.library.domain.guthub_api.entity.News> = ListFactory(
        listSource = object : ListSource<kz.tabyldy.library.domain.guthub_api.entity.News> {
            override suspend fun getList(): List<kz.tabyldy.library.domain.guthub_api.entity.News> {
                return domainFactory.newsRepository.getNewsList()
            }
        },
        strings = object : ListViewModel.Strings {
            override val unknownError: StringResource = R.string.unknown_error.toStrResource()
        },
        unitsFactory = object : ListViewModel.UnitsFactory<kz.tabyldy.library.domain.guthub_api.entity.News> {
            override fun createTile(data: kz.tabyldy.library.domain.guthub_api.entity.News): TableUnitItem {
                return newsUnitsFactory.createNewsTile(
                    id = data.id.toLong(),
                    title = data.fullName.orEmpty(),
                    description = data.description?.desc() ?: R.string.no_description.toStrResource().desc()
                )
            }
        }
    )

    val configFactory = ConfigFactory(
        configStore = object : ConfigStore {
            override var apiToken: String?
                get() = domainFactory.configRepository.apiToken
                set(value) {
                    domainFactory.configRepository.apiToken = value
                }
            override var isValid: Boolean?
                get() = domainFactory.configRepository.isValid
                set(value) {
                    domainFactory.configRepository.isValid = value
                }
        },
        validations = object : ConfigViewModel.Validations {
            override fun validateToken(value: String): StringDesc? {
                return if (value.isBlank()) {
                    R.string.invalid_token.toStrResource().desc()
                } else {
                    null
                }
            }

            override fun validateLanguage(value: String): StringDesc? {
                val validValues = listOf("ru", "us")

                return if (validValues.contains(value)) {
                    null
                } else {
                    StringDesc.ResourceFormatted(
                        R.string.invalid_language_s.toStrResource(),
                        validValues.joinToString(", ")
                    )
                }
            }
        },
        defaultToken = "ed155d0a445e4b4fbd878fe1f3bc1b7f",
        defaultLanguage = "us"
    )

    init {
        Napier.base(antilog)
    }

    interface NewsUnitsFactory {
        fun createNewsTile(
            id: Long,
            title: String,
            description: StringDesc
        ): TableUnitItem
    }
}
fun @receiver:StringRes Int.toStrResource():StringResource{
    return StringResource(this)
}
*/

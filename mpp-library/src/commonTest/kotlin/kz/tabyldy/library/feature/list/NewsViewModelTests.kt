/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package kz.tabyldy.library.feature.list

/*

import com.russhwolf.settings.Settings
import dev.icerock.moko.mvvm.ResourceState
import dev.icerock.moko.mvvm.test.TestViewModelScopeRule
import dev.icerock.moko.resources.desc.desc
import dev.icerock.moko.test.cases.InstantTaskRule
import dev.icerock.moko.test.cases.TestCases
import dev.icerock.moko.test.waitChildrenCompletion
import dev.icerock.moko.units.TableUnitItem
import io.ktor.client.engine.mock.*
import kz.tabyldy.library.NewsTableUnit
import kz.tabyldy.library.SharedFactory
import kz.tabyldy.library.createSharedFactory
import kz.tabyldy.library.domain.guthub_api.entity.News
import kz.tabyldy.library.feature.list.presentation.ListViewModel
import org.mockito.MockSettings
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class NewsViewModelTests : TestCases() {
    private val testViewModelScopeRule = TestViewModelScopeRule()

    override val rules: List<Rule> = listOf(
        InstantTaskRule(),
        testViewModelScopeRule
    )

    private lateinit var settings: MockSettings

    @BeforeTest
    fun setup() {
        settings = MockSettings()
    }

    @Test
    fun `load news items`() {
        val viewModel = createViewModel(settings)

        assertTrue(viewModel.state.value is ResourceState.Empty)

        viewModel.onCreated()

        testViewModelScopeRule.coroutineScope.waitChildrenCompletion()

        val dataState = viewModel.state.value
        assertTrue(dataState is ResourceState.Success, "state not data - $dataState")
        val items = listOf<TableUnitItem>(
            NewsTableUnit(
                id = "https://nypost.com/2021/04/16/trump-takes-jab-at-bidens-lunacy-of-jj-vaccination-pause/".hashCode()
                    .toLong(),
                title = "Trump takes jab at 'lunacy' of Johnson & Johnson vaccination pause - New York Post ",
                description = "Former President Donald Trump used a New York Post opinion piece to take aim at the Biden administration on Friday evening for allowing for a pause in the Johnson & Johnson coronavirus vaccine,…".desc()
            ),
            NewsTableUnit(
                id = "https://www.cnbc.com/2021/04/16/cramer-lightning-round-i-would-buy-lithia-motors-right-here.html".hashCode()
                    .toLong(),
                title = "Cramer's lightning round: I'd buy Lithia Motors right here - CNBC",
                description = "\"Mad Money\" host Jim Cramer rings the lightning round bell, which means he's giving his answers to callers' stock questions at rapid speed.".desc()
            )
        )
        assertEquals(expected = items, actual = dataState.data)
    }

    private fun createViewModel(
        settings: Settings
    ): ListViewModel<kz.tabyldy.library.domain.guthub_api.entity.News> {
        val factory: SharedFactory = createSharedFactory(settings) { request ->
            if (request.url.encodedPath == "top-headlines") {
                respondOk(newsResponseMock)
            } else {
                respondBadRequest()
            }
        }
        return factory.newsFactory.createListViewModel()
    }
}
*/

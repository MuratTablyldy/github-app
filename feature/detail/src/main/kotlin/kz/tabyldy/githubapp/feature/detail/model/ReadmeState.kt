package kz.tabyldy.githubapp.feature.detail.model

import androidx.annotation.StringRes

sealed interface ReadmeState {

    data object Loading : ReadmeState

    data object Empty : ReadmeState

    data class Error(
        @StringRes val error: Int
    ) : ReadmeState

    data class Loaded(
        val markdown: String
    ) : ReadmeState

}
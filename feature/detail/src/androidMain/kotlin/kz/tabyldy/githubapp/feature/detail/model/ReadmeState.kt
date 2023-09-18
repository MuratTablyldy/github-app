package kz.tabyldy.githubapp.feature.detail.model

sealed interface ReadmeState {

    object Loading : ReadmeState

    object Empty : ReadmeState

    data class Error(val error: String) : ReadmeState

    data class Loaded(val markdown: String) : ReadmeState
}
package kz.tabyldy.githubapp.feature.detail.model

import kz.tabyldy.core.model.RepoDetail


sealed interface State {
    object Loading : State

    data class Error(val error: String) : State

    data class Loaded(
        val githubRepo: RepoDetail,
        val readmeState: ReadmeState
    ) : State

}
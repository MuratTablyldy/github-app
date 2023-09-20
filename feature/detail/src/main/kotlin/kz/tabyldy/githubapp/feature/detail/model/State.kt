package kz.tabyldy.githubapp.feature.detail.model

import androidx.annotation.StringRes
import kz.tabyldy.core.model.RepoDetail


sealed interface State {

    data object Loading : State

    data class Error(
         @StringRes val error: Int
    ) : State

    data class Loaded(
        val githubRepo: RepoDetail,
        val readmeState: ReadmeState
    ) : State

}
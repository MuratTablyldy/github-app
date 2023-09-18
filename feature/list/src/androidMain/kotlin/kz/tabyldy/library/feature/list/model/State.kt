package kz.tabyldy.library.feature.list.model

import androidx.annotation.StringRes
import kz.tabyldy.core.model.Repo

sealed interface State {

    object Loading : State

    data class Loaded(val repos: List<Repo>) : State

    data class Error(@StringRes val error: Int) : State

    object Empty : State
}
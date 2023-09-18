package kz.tabyldy.library.feature.list.model

import androidx.annotation.StringRes
import dev.icerock.moko.resources.desc.StringDesc
import kz.tabyldy.core.model.Repo

sealed interface State {

    object Loading : State

    data class Loaded(val repos: List<Repo>) : State

    data class Error(@StringRes val error: Int) : State

    object Empty : State
}
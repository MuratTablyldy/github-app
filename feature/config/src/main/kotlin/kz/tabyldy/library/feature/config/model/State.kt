package kz.tabyldy.library.feature.config.model

sealed interface State {
    data object Idle : State
    data object Loading : State

}


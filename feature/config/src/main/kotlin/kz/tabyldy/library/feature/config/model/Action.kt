package kz.tabyldy.library.feature.config.model

sealed interface Action {
    data class ShowError(val message: String) : Action
    data object RouteToMain : Action

}
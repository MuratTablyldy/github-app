package kz.tabyldy.library.feature.config.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.icerock.moko.mvvm.livedata.LiveData
import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.livedata.mediatorOf
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.desc.desc
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kz.tabyldy.coreapi.usecase.GitHubUseCase

import kz.tabyldy.coreapi.exceptions.HttpException
import kz.tabyldy.coreapi.utils.SingleLiveEvent
import kz.tabyldy.githubapp.feature.config.R
import kz.tabyldy.library.feature.config.model.Action
import kz.tabyldy.library.feature.config.model.State
import javax.inject.Inject


class LoginViewModel @Inject constructor(
    private val useCase: GitHubUseCase
) : ViewModel() {

    private val invalidCharactersRegex = """[^A-z_0-9]""".toRegex()

    private val mutableState = MutableLiveData<State>(State.Idle)
    val state: LiveData<State>
        get() = mutableState

    private val actionMutableLiveData = SingleLiveEvent<Action>()
    val actionLiveData:androidx.lifecycle.LiveData<Action>
        get() = actionMutableLiveData

    val tokenField: MutableLiveData<String> = MutableLiveData("")

    val istTokenFieldInputComplete: MutableLiveData<Boolean> = MutableLiveData(false)

    val tokenFieldError =
        mediatorOf(tokenField, istTokenFieldInputComplete) { token, isComplete ->

            when {
                isComplete && token.isBlank() -> StringResource(R.string.empty_error).desc()

                isComplete && token.contains(invalidCharactersRegex) -> StringResource(R.string.invalid_characters).desc()

                isComplete && token.length < 10 -> StringResource(R.string.token_is_invalid).desc()

                else -> null
            }
        }


    private val actions = flow{
        mutableState.postValue(State.Loading)
        val result = useCase.checkToken()
        result.onSuccess {
            useCase.setValid(true)
            emit(Action.RouteToMain)
        }.onFailure {

            when (val exception = result.exceptionOrNull()) {

                is HttpException -> {
                    val message =
                        "${exception.localizedMessage}/${exception.code}\n ${exception.stackTraceToString()}"
                    emit(Action.ShowError(message))
                }

                else -> {
                    val message =
                        "${exception?.message}/${12002}\n ${exception?.stackTraceToString()}"
                    emit(Action.ShowError(message))
                }
            }
        }
    }
    fun onSignButtonPressed() {
        istTokenFieldInputComplete.postValue(true)
        if(tokenFieldError.value!=null) return
        viewModelScope.launch(Dispatchers.IO) {
            useCase.setApiTToken(tokenField.value)

            actions.collect { action ->
                actionMutableLiveData.postValue(action)
            }
        }
    }

    fun onRevokeState(){
        mutableState.postValue(State.Idle)
    }
    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}

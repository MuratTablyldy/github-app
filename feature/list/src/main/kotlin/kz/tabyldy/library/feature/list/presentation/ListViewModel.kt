package kz.tabyldy.library.feature.list.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kz.tabyldy.coreapi.usecase.GitHubUseCase
import kz.tabyldy.coreapi.exceptions.HttpException
import kz.tabyldy.library.feature.list.R
import kz.tabyldy.library.feature.list.model.State
import javax.inject.Inject

class ListViewModel @Inject constructor(private val useCase: GitHubUseCase) : ViewModel() {

    private val mutableState: MutableLiveData<State> = MutableLiveData(State.Loading)

    val state: LiveData<State>
        get() = mutableState

    private fun loadRepositories() {
        viewModelScope.launch(Dispatchers.IO) {
            mutableState.postValue(State.Loading)
            val result = useCase.getRepos()
            result.onSuccess { data ->

                if (data.isEmpty()) {
                    mutableState.postValue(State.Empty)
                } else {
                    mutableState.postValue(State.Loaded(data))
                }

            }.onFailure { exception ->

                when (exception) {

                    is HttpException -> {

                        if (exception.code == 401) {
                            mutableState.postValue(
                                State.Error(
                                   R.string.access_error
                                )
                            )
                        } else {
                            mutableState.postValue(
                                State.Error(
                                    R.string.something_went_wrong
                                )
                            )
                        }

                    }

                    else -> {
                        mutableState.postValue(
                            State.Error(
                                R.string.check_the_internet_error
                            )
                        )
                    }

                }
            }

        }

    }

    fun onCreated() {
        loadRepositories()
    }

    fun onRetryPressed() {
        loadRepositories()
    }
}

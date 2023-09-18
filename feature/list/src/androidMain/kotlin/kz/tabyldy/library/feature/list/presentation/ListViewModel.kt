package kz.tabyldy.library.feature.list.presentation

import dev.icerock.moko.mvvm.livedata.LiveData
import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kz.tabyldy.core.usecase.GitHubUseCase
import kz.tabyldy.library.feature.list.R
import kz.tabyldy.library.feature.list.model.State
import retrofit2.HttpException
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

                        if (exception.code() == 401) {
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

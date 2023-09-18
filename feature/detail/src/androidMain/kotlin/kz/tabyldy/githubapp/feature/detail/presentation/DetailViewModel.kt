package kz.tabyldy.githubapp.feature.detail.presentation

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kz.tabyldy.core.model.RepoDetail
import kz.tabyldy.core.usecase.GitHubUseCase
import kz.tabyldy.core.utils.ReadmeHandler
import kz.tabyldy.githubapp.feature.detail.model.ReadmeState
import kz.tabyldy.githubapp.feature.detail.model.State
import kz.tabyldy.githubapp.feature.detail.R
import retrofit2.HttpException
import javax.inject.Inject


class DetailViewModel @Inject constructor(private val useCase: GitHubUseCase):ViewModel() {
    private val mutableState: MutableLiveData<State> = MutableLiveData(State.Loading)

    val state: LiveData<State>
        get() = mutableState

    fun onLoading(owner: String, repo: String, context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            mutableState.postValue(State.Loading)
            val detail: RepoDetail?=
                useCase.getRepository(
                    ownerName = owner,
                    repositoryName = repo,
                ).onSuccess { data->
                    mutableState.postValue(
                        State.Loaded(data, ReadmeState.Loading)
                    )
                }.onFailure { exception->
                    if (exception is HttpException) {
                        when (exception.code()) {
                            401 -> {
                                val description = context.resources.getString(R.string.token_error)
                                mutableState.postValue(State.Error(description))
                            }
                            403 -> {
                                val description = context.resources.getString(R.string.forbiden)
                                mutableState.postValue(State.Error(description))
                            }
                            404 -> {
                                val description = context.resources.getString(R.string.no_redme)
                                mutableState.postValue(State.Error(description))
                            }
                            else -> {
                                val description = context.resources.getString(R.string.check_the_internet_error)
                                mutableState.postValue(State.Error(description))
                            }
                        }
                    } else {
                        val description = context.resources.getString(R.string.check_the_internet_error)
                        mutableState.postValue(State.Error(description))
                    }
                }.getOrNull()
            if(detail!=null){
                useCase.getRepositoryReadme(
                    id = detail.id,
                ).onSuccess { readme->
                    if (readme.isEmpty()) {
                        val newState = State.Loaded(detail, ReadmeState.Empty)
                        mutableState.postValue(newState)
                    } else {
                        val readmeDecoded = ReadmeHandler.handle(readme)
                        val newState = State.Loaded(detail, ReadmeState.Loaded(readmeDecoded))
                        mutableState.postValue(newState)
                    }
                }.onFailure { exception->
                    if (exception is HttpException) {
                        when (exception.code()) {
                            401 -> {
                                val description = context.resources.getString(R.string.token_error)
                                mutableState.postValue(State.Loaded(detail, ReadmeState.Error(description)))
                            }
                            403 -> {
                                val description = context.resources.getString(R.string.forbiden)
                                mutableState.postValue(State.Loaded(detail, ReadmeState.Error(description)))
                            }
                            404 -> {
                                mutableState.postValue(State.Loaded(detail, ReadmeState.Empty))
                            }
                            else -> {
                                val description = context.resources.getString(R.string.check_the_internet_error)
                                mutableState.postValue(State.Loaded(detail, ReadmeState.Error(description)))
                            }
                        }
                    } else {
                        val description = context.resources.getString(R.string.check_the_internet_error)
                        mutableState.postValue(State.Loaded(detail, ReadmeState.Error(description)))
                    }
                }
            }
        }

    }

    fun retryReadme(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            val data = state.value as State.Loaded
            val githubRepo=data.githubRepo
            val id = githubRepo.id
            useCase.getRepositoryReadme(
                id = id,
            ).onSuccess { readme->

                if (readme.isEmpty()) {
                    val newState = State.Loaded(githubRepo, ReadmeState.Empty)
                    mutableState.postValue(newState)
                } else {
                    val readmeDecoded = ReadmeHandler.handle(readme)
                    val newState = State.Loaded(githubRepo, ReadmeState.Loaded(readmeDecoded))
                    mutableState.postValue(newState)
                }
            }.onFailure { exception->

                if (exception is HttpException) {
                    when (exception.code()) {
                        401 -> {
                            val description = context.resources.getString(R.string.token_error)
                            mutableState.postValue(State.Loaded(githubRepo, ReadmeState.Error(description)))
                        }
                        403 -> {
                            val description = context.resources.getString(R.string.forbiden)
                            mutableState.postValue(State.Loaded(githubRepo, ReadmeState.Error(description)))
                        }
                        404 -> {
                            mutableState.postValue(State.Loaded(githubRepo, ReadmeState.Empty))
                        }
                        else -> {
                            val description = context.resources.getString(R.string.check_the_internet_error)
                            mutableState.postValue(State.Loaded(githubRepo, ReadmeState.Error(description)))
                        }
                    }
                } else {
                    val description = context.resources.getString(R.string.check_the_internet_error)
                    mutableState.postValue(State.Loaded(githubRepo, ReadmeState.Error(description)))
                }
            }
        }
    }

}
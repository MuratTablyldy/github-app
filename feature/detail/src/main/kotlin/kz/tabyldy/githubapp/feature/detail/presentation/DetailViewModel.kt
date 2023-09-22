package kz.tabyldy.githubapp.feature.detail.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kz.tabyldy.coreapi.usecase.GitHubUseCase
import kz.tabyldy.coreapi.exceptions.HttpException
import kz.tabyldy.coreapi.utils.ReadmeHandler
import kz.tabyldy.githubapp.feature.detail.model.ReadmeState
import kz.tabyldy.githubapp.feature.detail.model.State
import kz.tabyldy.githubapp.feature.detail.R
import javax.inject.Inject


class DetailViewModel @Inject constructor(private val useCase: GitHubUseCase) : ViewModel() {

    private val mutableState: MutableLiveData<State> = MutableLiveData(State.Loading)

    val state: LiveData<State>
        get() = mutableState

    fun loadDetailInfo(owner: String, repo: String, id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            mutableState.postValue(State.Loading)
            val detailResultTask = async {
                useCase.getRepository(
                    ownerName = owner,
                    repositoryName = repo,
                ).onSuccess { data ->
                    mutableState.postValue(
                        State.Loaded(data, ReadmeState.Loading)
                    )
                }.onFailure { exception ->
                    if (exception is HttpException) {

                        when (exception.code) {
                            401 -> {
                                val description = R.string.token_error
                                mutableState.postValue(State.Error(description))
                            }

                            403 -> {
                                val description = R.string.forbiden
                                mutableState.postValue(State.Error(description))
                            }

                            404 -> {
                                val description = R.string.no_redme
                                mutableState.postValue(State.Error(description))
                            }

                            else -> {
                                val description =
                                    R.string.check_the_internet_error
                                mutableState.postValue(State.Error(description))
                            }

                        }

                    } else {
                        val description =
                            R.string.check_the_internet_error
                        mutableState.postValue(State.Error(description))
                    }
                }
            }

            val readmeResultTusk = async {
                useCase.getRepositoryReadme(id)
            }

            val detailResult = detailResultTask.await()

            if (detailResult.isSuccess) {
                val detail = detailResult.getOrNull()
                if (detail != null) {
                    readmeResultTusk
                        .await()
                        .onSuccess { readme ->
                            if (readme.isEmpty()) {
                                val newState = State.Loaded(detail, ReadmeState.Empty)
                                mutableState.postValue(newState)
                            } else {
                                val readmeDecoded = ReadmeHandler.handle(readme)
                                val newState =
                                    State.Loaded(detail, ReadmeState.Loaded(readmeDecoded))
                                mutableState.postValue(newState)
                            }
                        }.onFailure { exception ->
                            if (exception is HttpException) {
                                when (exception.code) {

                                    401 -> {
                                        val description = R.string.token_error
                                        mutableState.postValue(
                                            State.Loaded(
                                                detail,
                                                ReadmeState.Error(description)
                                            )
                                        )
                                    }

                                    403 -> {
                                        val description = R.string.forbiden
                                        mutableState.postValue(
                                            State.Loaded(
                                                detail,
                                                ReadmeState.Error(description)
                                            )
                                        )
                                    }

                                    404 -> {
                                        mutableState.postValue(
                                            State.Loaded(
                                                detail,
                                                ReadmeState.Empty
                                            )
                                        )
                                    }

                                    else -> {
                                        val description =
                                            R.string.check_the_internet_error
                                        mutableState.postValue(
                                            State.Loaded(
                                                detail,
                                                ReadmeState.Error(description)
                                            )
                                        )
                                    }

                                }
                            } else {
                                val description =
                                    R.string.check_the_internet_error
                                mutableState.postValue(
                                    State.Loaded(
                                        detail,
                                        ReadmeState.Error(description)
                                    )
                                )
                            }
                        }
                }
            } else {
                return@launch
            }

        }
    }

    fun retryReadme() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = state.value as State.Loaded
            val githubRepo = data.githubRepo
            val id = githubRepo.id
            useCase.getRepositoryReadme(
                id = id,
            ).onSuccess { readme ->

                if (readme.isEmpty()) {
                    val newState = State.Loaded(githubRepo, ReadmeState.Empty)
                    mutableState.postValue(newState)
                } else {
                    val readmeDecoded = ReadmeHandler.handle(readme)
                    val newState = State.Loaded(githubRepo, ReadmeState.Loaded(readmeDecoded))
                    mutableState.postValue(newState)
                }

            }.onFailure { exception ->

                if (exception is HttpException) {
                    when (exception.code) {
                        401 -> {
                            val description = R.string.token_error
                            mutableState.postValue(
                                State.Loaded(
                                    githubRepo,
                                    ReadmeState.Error(description)
                                )
                            )
                        }

                        403 -> {
                            val description = R.string.forbiden
                            mutableState.postValue(
                                State.Loaded(
                                    githubRepo,
                                    ReadmeState.Error(description)
                                )
                            )
                        }

                        404 -> {
                            mutableState.postValue(State.Loaded(githubRepo, ReadmeState.Empty))
                        }

                        else -> {
                            val description =
                                R.string.check_the_internet_error
                            mutableState.postValue(
                                State.Loaded(
                                    githubRepo,
                                    ReadmeState.Error(description)
                                )
                            )
                        }
                    }
                } else {

                    val description = R.string.check_the_internet_error
                    mutableState.postValue(
                        State.Loaded(
                            githubRepo,
                            ReadmeState.Error(description)
                        )
                    )

                }
            }
        }
    }

}
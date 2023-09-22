package kz.tabyldy.library.feature.config.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.multibindings.IntoMap
import kz.tabyldy.coreapi.di.ViewModelKey
import kz.tabyldy.library.feature.config.presentation.LoginViewModel

@Module
@InstallIn(FragmentComponent::class)
interface LoginViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    fun bindDetailMovieViewModel(viewModel: LoginViewModel): ViewModel
}
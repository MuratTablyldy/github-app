package kz.tabyldy.githubapp.feature.detail.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.multibindings.IntoMap
import kz.tabyldy.coreapi.di.ViewModelKey
import kz.tabyldy.githubapp.feature.detail.presentation.DetailViewModel

@Module
@InstallIn(FragmentComponent::class)
interface DetailViewModelFactory {

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    fun bindDetailMovieViewModel(viewModel: DetailViewModel): ViewModel

}
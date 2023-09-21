package kz.tabyldy.library.feature.list.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.multibindings.IntoMap
import kz.tabyldy.core.di.ViewModelKey
import kz.tabyldy.library.feature.list.presentation.ListViewModel

@Module
@InstallIn(FragmentComponent::class)
interface ListViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ListViewModel::class)
    fun bindDetailMovieViewModel(viewModel: ListViewModel): ViewModel

}
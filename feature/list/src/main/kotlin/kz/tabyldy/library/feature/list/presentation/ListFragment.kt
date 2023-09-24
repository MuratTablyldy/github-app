package kz.tabyldy.library.feature.list.presentation

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import dagger.hilt.android.AndroidEntryPoint
import kz.tabyldy.library.feature.list.R
import kz.tabyldy.library.feature.list.adapters.RepositoriesAdapter
import kz.tabyldy.library.feature.list.databinding.ListFragmentLayoutBinding
import kz.tabyldy.library.feature.list.model.State
import kz.tabyldy.library.feature.list.navigation.ListNavigation
import me.vponomarenko.injectionmanager.x.XInjectionManager
import javax.inject.Inject

@AndroidEntryPoint
class ListFragment: Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel:ListViewModel by viewModels { viewModelFactory }

    private var _binding:ListFragmentLayoutBinding?=null

    private val binding:ListFragmentLayoutBinding
        get() = _binding!!

    private val navigation: ListNavigation by lazy {
        XInjectionManager.findComponent()
    }

    private val adapter: RepositoriesAdapter by lazy {
        RepositoriesAdapter { repository ->
            val owner = repository.owner!!.login
            val repoName = repository.name
            val id = repository.id
            navigation.navigateToDetailFragment(id,repoName,owner)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ListFragmentLayoutBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.repoRecyclerView.adapter = adapter

        if(savedInstanceState==null){
            viewModel.onCreated()
        }

        binding.toolbar.setOnMenuItemClickListener { menuItem ->

            if (menuItem.itemId == R.id.exit) {
                animateItem(R.id.exit)
                navigation.logoutFromListNavigation()
                true
            } else {
                false
            }
        }

        binding.toolbar.title=resources.getString(R.string.repositories)

        bind()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

    private fun bind() {
        viewModel.state.observe(viewLifecycleOwner) { state->
            when (state) {
                is State.Loading -> {
                    showLoadingView()
                }
                is State.Empty -> {
                    showEmptyView()
                }
                is State.Loaded -> {
                    adapter.setList(state.repos)
                    hideAllViews()
                }
                is State.Error -> {
                    when (val error = state.error) {

                        R.string.token_is_invalid -> {
                            showErrorView(R.drawable.ic_error_unmaned, R.string.error_title, error)
                        }

                        R.string.check_the_internet_error -> {
                            showErrorView(
                                R.drawable.ic_no_internet_error,
                                R.string.error_title,
                                error
                            )
                        }

                        R.string.access_error -> {
                            showErrorView(R.drawable.ic_error_unmaned, R.string.error_title, error)
                        }

                    }
                }
            }
        }

        val dividerDecoration =
            DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        val drawable =
            AppCompatResources.getDrawable(requireContext(), R.drawable.divider)
        if (drawable != null) {
            dividerDecoration.setDrawable(drawable)
        }
        binding.repoRecyclerView.addItemDecoration(dividerDecoration)

        binding.errorView.retryButton.setOnClickListener {
            viewModel.onRetryPressed()
        }

    }

    private fun animateItem(itemMenu: Int) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
            val icon = binding.toolbar.menu.findItem(itemMenu).icon as AnimatedVectorDrawable
            icon.start()
        } else {
            val icon = binding.toolbar.menu.findItem(itemMenu).icon as AnimatedVectorDrawableCompat
            icon.start()
        }

    }

    private fun showLoadingView() {
        binding.loadingView
        binding.loadingView.root.visibility = View.VISIBLE
        binding.errorView.root.visibility = View.GONE
    }

    private fun showErrorView(
        @DrawableRes iconId: Int,
        @StringRes errorHeader: Int,
        @StringRes errorMessage: Int
    ) {
        val icon = AppCompatResources.getDrawable(requireContext(), iconId)
        val headerText = resources.getString(errorHeader)
        val errorMessageText = resources.getString(errorMessage)
        val errorView = binding.errorView
        errorView.errorHeader.text = headerText
        errorView.errorMsgText.text = errorMessageText
        errorView.errorImage.setImageDrawable(icon)
        binding.loadingView.root.visibility = View.GONE
        binding.errorView.root.visibility = View.VISIBLE
    }
    private fun hideAllViews() {
        binding.loadingView.root.visibility = View.GONE
        binding.errorView.root.visibility = View.GONE
    }

    private fun showEmptyView() {
        val icon = AppCompatResources.getDrawable(requireContext(), R.drawable.ic_empty)
        val header = resources.getString(R.string.empty_header)
        val message = resources.getString(R.string.no_repositories_at_the_moment)
        val errorView = binding.errorView
        errorView.errorHeader.text = header
        errorView.errorMsgText.text = message
        errorView.errorImage.setImageDrawable(icon)
        binding.loadingView.root.visibility = View.GONE
        binding.errorView.root.visibility = View.VISIBLE
    }

}
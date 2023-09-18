package kz.tabyldy.library.feature.list.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import dagger.hilt.android.AndroidEntryPoint
import kz.tabyldy.core.base.BaseFragment
import kz.tabyldy.library.feature.list.R
import kz.tabyldy.library.feature.list.adapters.ReposAdapter
import kz.tabyldy.library.feature.list.databinding.ListFragmentLayoutBinding
import kz.tabyldy.library.feature.list.model.State
import javax.inject.Inject

@AndroidEntryPoint
class ListFragment:BaseFragment<ListFragmentLayoutBinding>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel:ListViewModel by viewModels { viewModelFactory }

    private val adapter: ReposAdapter by lazy {
        ReposAdapter { repository ->
            val owner = repository.owner!!.login
            val repoName = repository.name
            val id = repository.id
            val request = NavDeepLinkRequest.Builder
                .fromUri("app://gitHub.app/details/$repoName/$owner/$id".toUri())
                .build()
            findNavController().navigate(request)
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

        bind()
    }

    private fun bind() {
        viewModel.state.addObserver { state->
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
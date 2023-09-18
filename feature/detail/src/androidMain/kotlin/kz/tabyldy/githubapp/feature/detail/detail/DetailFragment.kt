package kz.tabyldy.githubapp.feature.detail.detail

import android.animation.Animator
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.text.HtmlCompat
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kz.tabyldy.core.base.BaseFragment
import kz.tabyldy.githubapp.feature.detail.model.ReadmeState
import kz.tabyldy.githubapp.feature.detail.model.State
import kz.tabyldy.githubapp.feature.detail.presentation.DetailViewModel
import kz.tabyldy.githubapp.feature.detail.R
import kz.tabyldy.githubapp.feature.detail.databinding.RepoInfoBinding


import javax.inject.Inject

@AndroidEntryPoint
class DetailFragment:BaseFragment<RepoInfoBinding>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: DetailViewModel by viewModels { viewModelFactory }

    private lateinit var repositoryName:String
    private lateinit var owner:String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = RepoInfoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        owner = requireArguments().getString(OWNER)!!
        repositoryName = requireArguments().getString(REPOSITORY_NAME)!!

        if (savedInstanceState == null) {
            viewModel.onLoading(owner, repositoryName, requireContext())
        }

        bind()
    }
    private fun bind() {

        binding.readmeHolder.setOnClickListener {
            viewModel.retryReadme(requireContext())
        }

        binding.errorView.retryButton.setOnClickListener {
            lifecycleScope.launch {
                viewModel.onLoading(
                    owner = owner,
                    repo = repositoryName,
                    requireContext()
                )
            }

        }

        viewModel.state.observe(viewLifecycleOwner) { state ->
            when (state) {

                is State.Loading -> {
                    stateLoading()
                }

                is State.Error -> {
                    stateError(
                        R.drawable.ic_no_internet_error,
                        R.string.error_title,
                        R.string.check_the_internet_error
                    )
                }

                is State.Loaded -> {
                    setStateLoaded()
                    binding.starsId.setNumber(state.githubRepo.stars.toString(), true)
                    binding.forks.setNumber(state.githubRepo.forks.toString(), true)
                    binding.license.text = state.githubRepo.license?.name
                    binding.watches.setNumber(state.githubRepo.watchers.toString(), true)
                    val link = state.githubRepo.htmlUrl
                    binding.link.text = HtmlCompat.fromHtml(link, HtmlCompat.FROM_HTML_MODE_LEGACY)
                    binding.link.movementMethod = LinkMovementMethod.getInstance()
                    when (val readmeState = state.readmeState) {

                        is ReadmeState.Loading -> {
                            setReadmeLoading()
                        }

                        is ReadmeState.Error -> {
                            setReadmeError(
                                R.drawable.ic_no_internet_error,
                                R.string.error_title,
                                R.string.check_your_internet_connection
                            )
                        }

                        is ReadmeState.Empty -> {
                            setReadmeEmpty()
                        }

                        is ReadmeState.Loaded -> {
                            setContent(readmeState.markdown)
                        }

                    }
                }
            }
        }
    }
    private fun setStateLoaded() {

        binding.errorView.root.visibility = View.GONE
        binding.loadingView.root.visibility = View.GONE
        binding.stateView.visibility = View.VISIBLE
    }

    private fun stateLoading() {
        binding.errorView.root.visibility = View.GONE
        binding.loadingView.root.visibility = View.VISIBLE
        binding.stateView.visibility = View.INVISIBLE
    }
    private fun stateError(
        @DrawableRes iconId: Int,
        @StringRes header: Int,
        @StringRes message: Int
    ) {
        val icon = AppCompatResources.getDrawable(requireContext(), iconId)
        val headerText = resources.getString(header)
        val messageText = resources.getString(message)
        val errorView = binding.errorView
        errorView.errorHeader.text = headerText
        errorView.errorImage.setImageDrawable(icon)
        errorView.errorMsgText.text = messageText
        binding.errorView.root.visibility = View.VISIBLE
        binding.loadingView.root.visibility = View.GONE
        binding.stateView.visibility = View.INVISIBLE
    }

    private fun setReadmeLoading() {
        binding.readmeEmpty.root.visibility = View.GONE
        binding.readmeLoading.root.visibility = View.VISIBLE
        binding.readmeError.root.visibility = View.GONE
        binding.readmeHolder.visibility = View.GONE
    }

    private fun setReadmeEmpty() {
        binding.readmeEmpty.root.visibility = View.VISIBLE
        binding.readmeLoading.root.visibility = View.GONE
        binding.readmeError.root.visibility = View.GONE
        binding.readmeHolder.visibility = View.GONE
    }

    private fun setReadmeError(
        @DrawableRes iconId: Int,
        @StringRes headerId: Int,
        @StringRes messageId: Int
    ) {
        val header = resources.getString(headerId)
        val message = resources.getString(messageId)
        val icon = AppCompatResources.getDrawable(requireContext(), iconId)
        val errorView = binding.errorView
        errorView.errorMsgText.text = message
        errorView.errorImage.setImageDrawable(icon)
        errorView.errorHeader.text = header
        binding.readmeEmpty.root.visibility = View.GONE
        binding.readmeLoading.root.visibility = View.GONE
        binding.readmeError.root.visibility = View.VISIBLE
        binding.readmeHolder.visibility = View.GONE
    }

    private fun setContent(html: String) {
        binding.readmeEmpty.root.visibility = View.GONE
        binding.readmeLoading.root.visibility = View.GONE
        binding.readmeError.root.visibility = View.GONE
        binding.readmeHolder.loadDataWithBaseURL(
            "app:htmlPage24",
            html,
            "text/html; charset=utf-8",
            "UTF-8",
            null
        )
        binding.readmeHolder.animate().alpha(1f)
            .setDuration(resources.getInteger(R.integer.duration).toLong())
            .setListener(object : Animator.AnimatorListener {

                override fun onAnimationEnd(p0: Animator) {
                    binding.readmeHolder.visibility = View.VISIBLE
                }

                override fun onAnimationStart(p0: Animator) {}
                override fun onAnimationCancel(p0: Animator) {}
                override fun onAnimationRepeat(p0: Animator) {}
            })
    }


    companion object{
        const val OWNER ="owner"
        const val REPOSITORY_NAME = "repo_name"
    }
}
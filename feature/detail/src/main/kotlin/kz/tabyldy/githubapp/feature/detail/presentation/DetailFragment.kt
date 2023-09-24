package kz.tabyldy.githubapp.feature.detail.presentation

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Build
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kz.tabyldy.githubapp.feature.detail.R
import kz.tabyldy.githubapp.feature.detail.databinding.RepoInfoBinding
import kz.tabyldy.githubapp.feature.detail.model.ReadmeState
import kz.tabyldy.githubapp.feature.detail.model.State
import kz.tabyldy.githubapp.feature.detail.navigation.DetailNavigation
import me.vponomarenko.injectionmanager.x.XInjectionManager
import javax.inject.Inject

@AndroidEntryPoint
class DetailFragment : Fragment() {

    companion object {
        const val OWNER = "owner"
        const val REPOSITORY_NAME = "repo_name"
        const val article_position = "ARTICLE_SCROLL_POSITION"
        const val ID = "id"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: DetailViewModel by viewModels { viewModelFactory }

    private var _binding: RepoInfoBinding? = null

    private val binding: RepoInfoBinding
        get() = _binding!!

    private var firstTime = true

    private lateinit var repositoryName: String

    private var id: Long = 0

    private lateinit var owner: String

    private val navigation: DetailNavigation by lazy {
        XInjectionManager.findComponent()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = RepoInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        owner = requireArguments().getString(OWNER)!!
        repositoryName = requireArguments().getString(REPOSITORY_NAME)!!
        id = requireArguments().getLong(ID)
        if (savedInstanceState == null) {
            viewModel.loadDetailInfo(owner, repositoryName, id = id)
        } else {
            binding.readmeHolder.restoreState(savedInstanceState)
            firstTime = false
            binding.readmeHolder.webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    binding.scroll.scrollTo(0, savedInstanceState.getInt(article_position))
                }
            }
        }
        binding.toolbar.setOnMenuItemClickListener { menuItem ->
            if (menuItem.itemId == R.id.exit) {
                animateItem(R.id.exit)
                navigation.logoutFromDetailFragment()
                true
            } else {
                false
            }
        }
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener {
           navigation.backToListFFragment()
        }
        binding.toolbar.title=repositoryName
        bind()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        binding.readmeHolder.saveState(outState)
        outState.putInt(
            article_position, binding.scroll.scrollY
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun bind() {
        binding.readmeHolder.setOnClickListener {
            viewModel.retryReadme()
        }

        binding.errorView.retryButton.setOnClickListener {
            lifecycleScope.launch {
                viewModel.loadDetailInfo(
                    owner = owner, repo = repositoryName, id = id
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
                        R.drawable.ic_no_internet_error, R.string.error_title, state.error
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
                                readmeState.error
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
        @DrawableRes iconId: Int, @StringRes header: Int, @StringRes message: Int
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
        @DrawableRes iconId: Int, @StringRes headerId: Int, @StringRes messageId: Int
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

        if (firstTime) {
            binding.readmeHolder.loadDataWithBaseURL(
                "app:htmlPage24", html, "text/html; charset=utf-8", "UTF-8", null
            )
            val animation = android.view.animation.AnimationUtils.loadAnimation(
                requireContext(), R.anim.introduction_animation
            )
            binding.readmeHolder.startAnimation(animation)
        }

        binding.readmeHolder.visibility = View.VISIBLE
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

}
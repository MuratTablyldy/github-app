package kz.tabyldy.library.feature.config.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnFocusChangeListener
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import dev.icerock.moko.mvvm.livedata.bindTwoWayToEditTextText
import kz.tabyldy.githubapp.feature.config.R
import kz.tabyldy.githubapp.feature.config.databinding.LoginLayoutBinding
import kz.tabyldy.library.feature.config.model.Action
import kz.tabyldy.library.feature.config.model.State
import kz.tabyldy.library.feature.config.navigation.LoginNavigation
import kz.tabyldy.library.feature.config.views.ProgressButton
import me.vponomarenko.injectionmanager.x.XInjectionManager

@AndroidEntryPoint
class LoginFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: LoginViewModel by viewModels { viewModelFactory }

    private var _binding: LoginLayoutBinding? = null
    private val binding: LoginLayoutBinding
        get() = _binding!!

    private val navigation: LoginNavigation by lazy {
        XInjectionManager.findComponent()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LoginLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tokenEdit.onFocusChangeListener =
            OnFocusChangeListener { _, changed ->
                viewModel.istTokenFieldInputComplete.postValue(
                    !changed
                )
            }

        binding.singInButton.setOnClickListener {

            viewModel.onSignButtonPressed()
        }
        viewModel.apply {
            tokenField.bindTwoWayToEditTextText(viewLifecycleOwner, binding.tokenInput.editText!!)

            tokenFieldError.addObserver {
                binding.tokenInput.error = it?.toString(requireContext())
            }

            state.addObserver { state ->
                when (state) {
                    is State.Idle -> {
                        binding.tokenInput.isEnabled = true
                        binding.singInButton.setState(ProgressButton.State.IDLE)
                    }

                    is State.Loading -> {
                        binding.tokenInput.isEnabled = false
                        binding.singInButton.setState(ProgressButton.State.LOADING)
                    }
                }
            }
            actionLiveData.observe(viewLifecycleOwner) { action ->
                when (action) {
                    is Action.ShowError -> {
                        binding.tokenInput.error = resources.getString(R.string.token_is_invalid)
                        AlertDialog.Builder(
                            requireContext(),
                            R.style.dialogTheme
                        )
                            .setTitle(resources.getString(R.string.error_title))
                            .setMessage(action.message)
                            .setPositiveButton(R.string.positive_button_text) { _, _ ->
                                viewModel.onRevokeState()
                            }.create().show()
                    }

                    is Action.RouteToMain -> {
                        navigation.navigateToMain()
                    }
                }
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
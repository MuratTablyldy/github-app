package kz.tabyldy.githubapp.navigationfragment

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import dagger.hilt.android.AndroidEntryPoint
import kz.tabyldy.core.storage.KeyValueStorage
import kz.tabyldy.githubapp.R
import kz.tabyldy.githubapp.activityNavController
import kz.tabyldy.githubapp.databinding.NavFragmentLayoutBinding
import kz.tabyldy.githubapp.navigateSafely
import javax.inject.Inject

@AndroidEntryPoint
class NavigationFragment(): BaseFragment<NavFragmentLayoutBinding>() {

    @Inject lateinit var keyValueStorage: KeyValueStorage
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = NavFragmentLayoutBinding.inflate(inflater,container,false)
        binding.toolbar.setOnMenuItemClickListener { menuItem ->
            if (menuItem.itemId == R.id.exit) {
                animateItem(R.id.exit)
                keyValueStorage.isValid = false
                activityNavController().navigateSafely(R.id.action_global_signFlowFragment)
                true
            } else {
                false
            }
        }
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener {
            binding.navHostFragmentMain.findNavController().navigateUp()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        val navigationListener =
            NavController.OnDestinationChangedListener { _, destination, arguments ->
                when(destination.id){
                    R.id.list_repositories_fragment->{
                        binding.toolbar.navigationIcon = null
                        binding.toolbar.title = resources.getString(R.string.repositories)
                    }
                    R.id.detail_fragment->{
                        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
                        binding.toolbar.title = arguments?.getString("repo_name")
                    }
                }
            }
        binding.navHostFragmentMain.findNavController().addOnDestinationChangedListener(navigationListener)

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
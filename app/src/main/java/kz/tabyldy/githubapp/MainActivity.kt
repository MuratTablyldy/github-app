package kz.tabyldy.githubapp

import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.vectordrawable.graphics.drawable.Animatable2Compat
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import dagger.hilt.android.AndroidEntryPoint
import kz.tabyldy.coreapi.storage.KeyValueStorage
import kz.tabyldy.githubapp.databinding.ActivityMainBinding
import kz.tabyldy.githubapp.navigation.Navigator
import me.vponomarenko.injectionmanager.x.XInjectionManager
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    @Inject
    lateinit var keyValueStorage: KeyValueStorage

    private val navigator: Navigator by lazy {
        XInjectionManager.findComponent()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val screen = installSplashScreen()
        if (savedInstanceState == null) {
            screen.setOnExitAnimationListener { splashScreenProvider ->
                val iconView = splashScreenProvider.iconView as ImageView
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {

                    val animDrawable = AppCompatResources.getDrawable(
                        this, R.drawable.spash_anim
                    ) as AnimatedVectorDrawable
                    iconView.setImageDrawable(animDrawable)
                    animDrawable.registerAnimationCallback(object :
                        Animatable2.AnimationCallback() {
                        override fun onAnimationEnd(drawable: Drawable?) {
                            super.onAnimationEnd(drawable)
                            splashScreenProvider.remove()
                            animDrawable.unregisterAnimationCallback(this)
                        }
                    })
                    animDrawable.start()

                } else {

                    val animDrawable = AppCompatResources.getDrawable(
                        this, R.drawable.spash_anim
                    ) as AnimatedVectorDrawableCompat
                    iconView.setImageDrawable(animDrawable)
                    animDrawable.registerAnimationCallback(object :
                        Animatable2Compat.AnimationCallback() {
                        override fun onAnimationEnd(drawable: Drawable?) {
                            super.onAnimationEnd(drawable)
                            splashScreenProvider.remove()
                            animDrawable.unregisterAnimationCallback(this)
                        }
                    })
                    animDrawable.start()

                }
            }
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigation()
    }

    override fun onResume() {
        super.onResume()
        navigator.bind(
            navController = navController,
            onLogOut = {
                keyValueStorage.isValid = false
            }
        )
    }

    override fun onPause() {
        super.onPause()
        navigator.unbind()
    }

    override fun onSupportNavigateUp(): Boolean = navController.navigateUp()

    private fun setupNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        val navGraph = navController.navInflater.inflate(R.navigation.main_nav_graph)
        when (keyValueStorage.isValid) {
            true -> {
                navGraph.setStartDestination(R.id.list_repositories_fragment)
            }

            else -> {
                navGraph.setStartDestination(R.id.signFlowFragment)
            }
        }
        navController.graph = navGraph
    }

}
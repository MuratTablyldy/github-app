package kz.tabyldy.githubapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kz.tabyldy.githubapp.navigation.Navigator
import me.vponomarenko.injectionmanager.IHasComponent
import me.vponomarenko.injectionmanager.x.XInjectionManager

@HiltAndroidApp
class Application:Application(){

    override fun onCreate() {
        super.onCreate()

        XInjectionManager.bindComponentToCustomLifecycle(object : IHasComponent<Navigator> {
            override fun getComponent(): Navigator = Navigator()
        })
    }
}
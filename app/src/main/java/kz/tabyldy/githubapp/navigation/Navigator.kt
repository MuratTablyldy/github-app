package kz.tabyldy.githubapp.navigation

import android.os.Bundle
import androidx.navigation.NavController
import kz.tabyldy.githubapp.feature.detail.navigation.DetailNavigation
import kz.tabyldy.library.feature.config.navigation.LoginNavigation
import kz.tabyldy.library.feature.list.navigation.ListNavigation
import kz.tabyldy.githubapp.R
import kz.tabyldy.githubapp.feature.detail.presentation.DetailFragment
import kz.tabyldy.githubapp.navigateSafely

typealias Predicate = () -> Unit
class Navigator:LoginNavigation,ListNavigation,DetailNavigation {

    private var navController: NavController? = null

    private var onLogOut:Predicate?=null
    override fun navigateToMain() {
        navController?.navigateSafely(R.id.action_global_mainFlowFragment)
    }

    override fun navigateToDetailFragment(id:Long,repositoryName:String,owner:String) {
        val bundle = Bundle()
        bundle.putLong(DetailFragment.ID,id)
        bundle.putString(DetailFragment.OWNER,owner)
        bundle.putString(DetailFragment.REPOSITORY_NAME,repositoryName)
      navController?.navigateSafely(R.id.action_list_repositories_fragment_to_detail_fragment,bundle)
    }

    override fun logoutFromListNavigation() {
        onLogOut?.invoke()
        navController?.navigateSafely(R.id.action_global_signFlowFragment)
    }

    override fun navigateToListFragment() {
        navController?.navigateUp()
    }

    override fun logoutFromDetailFragment() {
        onLogOut?.invoke()
        navController?.navigateSafely(R.id.action_global_signFlowFragment)
    }

    override fun backToListFFragment() {
        navController?.navigateUp()
    }

    fun bind(navController: NavController,onLogOut: Predicate){
        this.navController = navController
        this.onLogOut=onLogOut
    }

    fun unbind() {
        navController = null
        onLogOut=null
    }

}
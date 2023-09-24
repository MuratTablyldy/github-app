package kz.tabyldy.library.feature.list.navigation

interface ListNavigation {

    fun navigateToDetailFragment(id:Long,repositoryName:String,owner:String)

    fun logoutFromListNavigation()
}
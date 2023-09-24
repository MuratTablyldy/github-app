plugins{
    id("android-library-convention")
}

android {
    namespace = "kz.tabyldy.shared"

}
dependencies{
    api(libs.lifecycleViewModel)
    api(libs.navigation)
    api(libs.navigationUI)
    api(libs.corektx)
    api(libs.fragment)
    api(libs.xComponent)
}
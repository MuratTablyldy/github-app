plugins{
    id("android-library-convention")
    id("kotlin-kapt")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("dagger.hilt.android.plugin")


}
android{
    namespace = "kz.tabyldy.core"
}
dependencies {
    api(libs.coroutines)
    api(libs.retrofit)
    api(libs.kotlinSerialization)
    api(libs.multiplatformSettings)
    api(libs.okHttpInteceptor)
    api (libs.hilt)
    kapt (libs.hiltCompiler)
    kapt(libs.metadata)
    api(libs.mdTool)
    api(libs.lifecycleViewModel)
    api(libs.navigation)
    api(libs.navigationUI)
    api(libs.appCompat)
    api(libs.material)
    api(libs.corektx)
    api(libs.fragment)
}
kapt {
    correctErrorTypes = true
}

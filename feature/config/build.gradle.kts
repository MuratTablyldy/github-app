plugins {
    id("android-library-convention")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android{
    namespace = "kz.tabyldy.githubapp.feature.config"
    buildFeatures.viewBinding = true
}

dependencies {
    implementation(project(":core-github"))
    implementation(libs.coroutines)
    implementation(libs.appCompat)
    implementation(libs.material)
    implementation(libs.lifecycleViewModel)
    implementation(libs.mokoMvvmLiveData)
    implementation(libs.mokoMvvmCore)
    implementation(libs.retrofit)
    implementation(libs.korlinSerialization)
    implementation(libs.okHttpInteceptor)
    implementation(libs.corektx)
    implementation(libs.fragment)
    implementation (libs.hilt)
    kapt (libs.hiltCompiler)
    kapt(libs.metadata)
    implementation(libs.navigation)
    implementation(libs.navigationUI)
}

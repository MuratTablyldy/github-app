plugins {
    id("android-library-convention")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android{
    namespace = "kz.tabyldy.githubapp.feature.detail"
    buildFeatures.viewBinding = true
}

dependencies {
    implementation(project(":core-github"))
    implementation(libs.coroutines)
    implementation(libs.appCompat)
    implementation(libs.material)
    implementation(libs.lifecycleViewModel)
    implementation(libs.mdTool)
    implementation(libs.mokoMvvmLiveData)
    implementation(libs.mokoMvvmCore)
    implementation(libs.mokoMvvmLiveData)
    implementation(libs.retrofit)
    implementation(libs.korlinSerialization)
    implementation(libs.okHttpInteceptor)
    implementation(libs.corektx)
    implementation(libs.fragment)
    implementation(libs.hilt)
    kapt(libs.hiltCompiler)
    kapt(libs.metadata)
    implementation(libs.navigation)
    implementation(libs.navigationUI)
    implementation(libs.lifecycleViewModel)
    implementation(libs.tiker)
    implementation(libs.mdTool)
}
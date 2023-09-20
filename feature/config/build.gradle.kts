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
    implementation(libs.mokoMvvmLiveData)
    implementation(libs.mokoMvvmCore)
    implementation (libs.hilt)
    kapt (libs.hiltCompiler)
    kapt(libs.metadata)
}

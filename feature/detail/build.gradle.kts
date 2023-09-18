plugins {
    id("multiplatform-library-convention")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android{
    namespace = "kz.tabyldy.githubapp.feature.detail"
    buildFeatures.viewBinding = true
}

dependencies {
    implementation(project(":core-github"))
    commonMainImplementation(libs.coroutines)
    implementation(libs.appCompat)
    implementation(libs.material)
    commonMainImplementation(libs.lifecycleViewModel)
    commonMainImplementation(libs.mdTool)
    commonMainImplementation(libs.mokoMvvmLiveData)
   // commonMainImplementation(libs.mokoResources)
    commonMainImplementation(libs.mokoMvvmCore)
    commonMainImplementation(libs.mokoMvvmLiveData)
    commonMainImplementation(libs.retrofit)
    commonMainImplementation(libs.korlinSerialization)
    commonMainImplementation(libs.okHttpInteceptor)
    implementation(libs.corektx)
    implementation(libs.fragment)
    implementation(libs.hilt)
    kapt(libs.hiltCompiler)
    kapt(libs.metadata)
    implementation(libs.navigation)
    implementation(libs.navigationUI)
    commonMainImplementation(libs.lifecycleViewModel)
    implementation(libs.tiker)
    implementation(libs.mdTool)
}
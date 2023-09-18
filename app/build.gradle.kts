plugins {
    id("kotlin-kapt")
    id ("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("android-app-convention")
}

android {
    buildFeatures.viewBinding = true
    buildFeatures.buildConfig = true
    namespace = "kz.tabyldy.githubapp"
    defaultConfig {
        applicationId = "kz.tabyldy.githubapp"
        versionCode = 1
        versionName = "0.1.0"
    }
}

dependencies {
    implementation(libs.appCompat)
    implementation(libs.material)
    implementation(libs.recyclerView)
    implementation(libs.swipeRefreshLayout)
    implementation(libs.mokoMvvmDataBinding)
    implementation(libs.navigation)
    implementation(libs.navigationUI)
    implementation (libs.lifecycleViewModel)
    implementation(libs.splashScreen)
    implementation(libs.retrofit)
    implementation(libs.kotlinSerialization)
    implementation(libs.multiplatformSettings)
    implementation(libs.okHttpInteceptor)
    implementation (libs.hilt)
    implementation(project(":mpp-library:core-github"))
    kapt (libs.hiltCompiler)
    implementation(libs.tiker)
    implementation(libs.mdTool)
    implementation(project(":mpp-library:feature:config"))
    implementation(project(":mpp-library:feature:list"))
    implementation(project(":mpp-library:feature:detail"))
    implementation(libs.splashScreen)
}



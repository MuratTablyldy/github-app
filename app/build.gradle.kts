plugins {
    id("kotlin-kapt")
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
    implementation(project(":feature:config"))
    implementation(project(":feature:list"))
    implementation(project(":feature:detail"))
    implementation(project(":core-github"))
    implementation(libs.splashScreen)
    implementation (libs.hilt)
    kapt (libs.hiltCompiler)

}



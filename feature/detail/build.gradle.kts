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
    implementation(project(":core-github:core-provider"))
    implementation(project(":shared-libs"))
    implementation(libs.hilt)
    kapt(libs.hiltCompiler)
    kapt(libs.metadata)
    implementation(libs.tiker)
}
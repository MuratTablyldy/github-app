plugins {
    id("android-library-convention")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android{
    namespace = "kz.tabyldy.library.feature.list"
    buildFeatures.viewBinding = true
}

dependencies {
    implementation(project(":core-provider"))
    implementation(project(":shared-libs"))
    implementation(libs.recyclerView)
    implementation(libs.hilt)
    kapt(libs.hiltCompiler)
    kapt(libs.metadata)
}


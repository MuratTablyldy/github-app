/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("multiplatform-library-convention")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android{
    namespace = "kz.tabyldy.library.feature.list"
    buildFeatures.viewBinding = true
}

dependencies {
    implementation(project(":mpp-library:core-github"))
    implementation(libs.coroutines)
    implementation(libs.appCompat)
    implementation(libs.material)
    implementation(libs.lifecycleViewModel)
    implementation(libs.recyclerView)
    implementation(libs.mokoMvvmLiveData)
    implementation(libs.mokoMvvmState)
    implementation(libs.mokoResources)
    implementation(libs.mokoUnits)
    implementation(libs.napier)
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.fragment:fragment-ktx:1.6.1")
    implementation(libs.recyclerView)
    implementation(libs.retrofit)
    implementation(libs.korlinSerialization)
    implementation(libs.okHttpInteceptor)
    implementation(libs.hilt)
    kapt(libs.hiltCompiler)
    kapt(libs.metadata)
    implementation(libs.navigation)
    implementation(libs.navigationUI)

}


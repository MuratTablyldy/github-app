/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

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
    implementation(project(":core-github"))
    implementation(libs.coroutines)
    implementation(libs.appCompat)
    implementation(libs.material)
    implementation(libs.lifecycleViewModel)
    implementation(libs.recyclerView)
    implementation(libs.mokoMvvmLiveData)
    implementation(libs.mokoMvvmState)
    implementation(libs.coreKtx)
    implementation(libs.fragment)
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


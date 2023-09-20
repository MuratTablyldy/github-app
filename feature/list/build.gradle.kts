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
    implementation(libs.recyclerView)
    implementation(libs.hilt)
    kapt(libs.hiltCompiler)
    kapt(libs.metadata)
}


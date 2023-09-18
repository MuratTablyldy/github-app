/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")
   // id("dev.icerock.mobile.multiplatform.android-manifest")
    id("android-base-convention")
}

kotlin {
    jvmToolchain(17)
    androidTarget()
}

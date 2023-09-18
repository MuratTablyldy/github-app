
plugins {
    id("com.android.application")
    id("kotlin-android")
    id("android-base-convention")
}

android {
    defaultConfig {
        multiDexEnabled = true
    }


    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName("debug") {
            isDebuggable = true
            applicationIdSuffix = ".debug"
        }
    }}
kotlin{
    jvmToolchain(17)
}



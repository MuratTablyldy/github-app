
plugins {
    id("multiplatform-library-convention")
}

android {
    namespace = "kz.tabyldy.library"
    buildFeatures.viewBinding = true
}

dependencies {
    commonMainImplementation(libs.coroutines)
    commonMainImplementation(libs.ktorClient)
    commonMainImplementation(libs.lifecycleViewModel)
    commonMainApi(libs.multiplatformSettings)
    commonMainApi(libs.napier)
    commonMainApi(libs.mokoParcelize)
    commonMainApi(libs.mokoResources)
    commonMainApi(libs.mokoMvvmCore)
    commonMainApi(libs.mokoMvvmLiveData)
    commonMainApi(libs.mokoMvvmState)
    commonMainApi(libs.mokoUnits)
    commonMainApi(libs.mokoFields)
    commonTestImplementation(libs.mokoTestCore)
    commonTestImplementation(libs.mokoMvvmTest)
    commonTestImplementation(libs.mokoUnitsTest)
    commonTestImplementation(libs.multiplatformSettingsTest)
    commonTestImplementation(libs.ktorClientMock)
    implementation(libs.navigation)
    implementation(libs.navigationUI)
    implementation(libs.appCompat)
    implementation(libs.material)

}




plugins{
    id("android-library-convention")
}

android {
    namespace = "kz.tabyldy.coreapi"
}

dependencies {
    implementation(libs.coroutines)
    implementation(libs.hilt)
    implementation(libs.mdTool)
    api(libs.kotlinSerialization)
}
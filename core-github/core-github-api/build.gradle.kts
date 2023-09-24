plugins{
    id("android-library-convention")
    id("org.jetbrains.kotlin.plugin.serialization")
}

android {
    namespace = "kz.tabyldy.coreapi"
}

dependencies {
    implementation(libs.coroutines)
    implementation(libs.hilt)
    implementation(libs.mdTool)
    implementation(libs.kotlinSerialization)
}
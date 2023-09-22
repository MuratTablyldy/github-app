plugins{
    id("android-library-convention")
    id("kotlin-kapt")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("dagger.hilt.android.plugin")
}

android{
    namespace = "kz.tabyldy.core"
}

dependencies {
    implementation(project(":core-github-api"))
    implementation(libs.hilt)
    implementation(libs.retrofit)
    implementation(libs.multiplatformSettings)
    implementation(libs.okHttpInteceptor)
    kapt (libs.hiltCompiler)
}

kapt {
    correctErrorTypes = true
}

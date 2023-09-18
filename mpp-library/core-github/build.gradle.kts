plugins{
    id("kotlin-kapt")
    id("com.android.library")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("multiplatform-library-convention")
    id("dagger.hilt.android.plugin")


}
android{
    namespace = "kz.tabyldy.core"
    buildFeatures.viewBinding = true
}
dependencies {


    implementation(libs.coroutines)
    implementation(libs.retrofit)
    implementation(libs.kotlinSerialization)
    implementation(libs.multiplatformSettings)
    implementation(libs.okHttpInteceptor)
    implementation (libs.hilt)
    kapt (libs.hiltCompiler)
    kapt(libs.metadata)
    implementation(libs.mdTool)
    implementation(libs.mdTool)
    implementation(libs.lifecycleViewModel)

}
kapt {
    correctErrorTypes = true
}

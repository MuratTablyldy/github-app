plugins{
    id("android-library-convention")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}
android{
    namespace = "kz.tabyldy.provider"
}

dependencies{
    implementation(project(":core-github:core-github-impl"))
    api(project(":core-github:core-github-api"))
    implementation(libs.hilt)
    kapt (libs.hiltCompiler)
}

plugins{
    id("android-library-convention")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}
android{
    namespace = "kz.tabyldy.provider"
}

dependencies{
    implementation(project(":core-github"))
    api(project(":core-github-api"))
    implementation(libs.hilt)
    kapt (libs.hiltCompiler)
}

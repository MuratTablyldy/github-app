
buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
    dependencies {
        classpath(libs.kotlinSerializationGradle)
        classpath(libs.hiltGradle)
        classpath(":build-logic")
        classpath(libs.kotlinGradlePlugin)

    }
}

tasks.register("clean", Delete::class).configure {
    group = "build"
    delete(rootProject.buildDir)
}
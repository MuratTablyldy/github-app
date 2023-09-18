
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
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
        classpath("dev.icerock.moko:resources-generator:0.23.0")
    }
}


tasks.register("clean", Delete::class).configure {
    group = "build"
    delete(rootProject.buildDir)
}
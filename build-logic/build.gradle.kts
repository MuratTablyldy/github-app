plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    api("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
    api("com.android.tools.build:gradle:8.1.1")
}

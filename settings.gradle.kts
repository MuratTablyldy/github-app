include(":mpp-library:domain:core-github-api")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "github-app"
includeBuild("build-logic")
include(":mpp-library")
include(":mpp-library:feature:config")
include(":mpp-library:feature:list")
include(":mpp-library:core-github")
include(":mpp-library:feature:detail")
include(":app")



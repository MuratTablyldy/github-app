dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "github-app"
includeBuild("build-logic")

include(":feature:config")
include(":feature:list")
include(":core-github:core-github-impl")
include(":feature:detail")
include(":shared-libs")
include(":core-github:core-github-api")
include(":app")
include(":core-github:core-provider")



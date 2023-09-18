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
include(":core-github")
include(":feature:detail")
include(":app")



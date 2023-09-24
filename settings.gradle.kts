import java.net.URI

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = URI("https://jitpack.io") }
    }
}

rootProject.name = "github-app"
includeBuild("build-logic")

include(":shared-libs")
include(":feature:config")
include(":feature:list")
include(":feature:detail")
include(":core-github:core-github-impl")
include(":core-github:core-github-api")
include(":core-github:core-provider")
include(":app")



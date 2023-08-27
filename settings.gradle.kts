pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BaseApp"
include(":app")

include(":feature:login")
include(":feature:home")

include(":designsystem")

include(":data")
include(":data:network")
include(":data:database")

include(":core")
include(":core:authentication")

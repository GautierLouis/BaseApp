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

include(":core")
include(":core:network")
include(":core:database")

include(":data:authentication")

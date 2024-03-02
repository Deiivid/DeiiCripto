pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "DeiiCripto"
include(
    ":app",
    ":domain",
    ":data",
    ":common",
    ":domain:usecase",
    ":domain:models",
    ":common:di",
    ":data:models",
    ":data:repository",
    ":data:repository",
    ":data:datasources",
    ":data:mappers"
)

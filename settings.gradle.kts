// "DSL_SCOPE_VIOLATION" suppress false positive errors on `libs` due to a gradle
// issue: https://github.com/gradle/gradle/issues/22797.
// "UnstableApiUsage" suppress warnings from code marked unstable due to the use
// of experimental features annotated @Incubating.
@file:Suppress("UnstableApiUsage")

pluginManagement {
    includeBuild("build-logic")
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
rootProject.name = "RandomUserApp"
include(":app")

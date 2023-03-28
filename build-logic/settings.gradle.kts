// "UnstableApiUsage" suppress warnings from code marked unstable due to the use
// of experimental features annotated @Incubating.
@file:Suppress("UnstableApiUsage")

// feature preview of type-safe alternative to project(":client").
// You can use implementation projects.client instead.

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "build-logic"
include(":convention")

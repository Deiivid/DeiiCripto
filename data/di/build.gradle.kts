plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies{
    implementation(libs.bundles.data.di)
    implementation(project(":data:datasources"))
    implementation (project(":data:repository"))
    implementation (project(":data:repository"))
}
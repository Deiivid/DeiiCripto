plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation (project(":data:datasources"))
    implementation (project(":data:mappers"))
    implementation (project(":data:models"))
    implementation (project(":data:repository"))
    implementation(libs.bundles.data)
}
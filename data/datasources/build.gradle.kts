plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies{
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("androidx.room:room-runtime:2.3.0")
    implementation(project(":data:models"))
    implementation(project(":data:mappers"))
}
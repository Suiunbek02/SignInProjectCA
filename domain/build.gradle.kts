plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {

    // Coroutines
    implementation(Dependencies.Coroutines.coroutinesAndroid)
    implementation (Dependencies.Coroutines.coroutinesCore)

    //Inject
    api("javax.inject:javax.inject:1")

    //Common
    api(project(":common"))
}
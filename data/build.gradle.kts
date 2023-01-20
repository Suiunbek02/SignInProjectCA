plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.suiunbek.data"
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.compileAndTargetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //Core
    implementation(Dependencies.Core.core)

    // Retrofit 2
    implementation(Dependencies.Retrofit2.retrofit)
    implementation(Dependencies.Retrofit2.gsonConverter)

    // OkHttp
    implementation(Dependencies.OkHttp.okhttpBom)
    implementation(Dependencies.OkHttp.okhttp)
    implementation(Dependencies.OkHttp.loggingInterceptor)

    // Coroutines
    implementation(Dependencies.Coroutines.coroutinesAndroid)
    implementation (Dependencies.Coroutines.coroutinesCore)

    //Domain
    implementation(project(":domain"))

    //Inject
    implementation("javax.inject:javax.inject:1")

}
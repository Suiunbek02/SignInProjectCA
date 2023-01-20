import Plugins.kapt

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    // Kapt
    kotlin(Plugins.kapt)
    // Hilt
    id(Plugins.hilt)

}
android {
    namespace = "com.suiunbek.presentation"
    compileSdk = 32

    defaultConfig {
        minSdk = 24
        targetSdk = 32

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

    buildFeatures.viewBinding = true

}

dependencies {

    //Core
    implementation(Dependencies.Core.core)

    //Application
    implementation(Dependencies.UIComponents.appcompat)

    //Material
    implementation(Dependencies.UIComponents.material)

    //Constraint layout
    implementation(Dependencies.UIComponents.constraintLayout)

    // ViewBinding Property Delegate
    implementation(Dependencies.ViewBindingPropertyDelegate.viewBindingDelegate)

    // Navigation
    implementation(Dependencies.Navigation.navigation)

    //Domain
    implementation(project(":domain"))

    //Hilt
    implementation(Dependencies.DaggerHilt.daggerHilt)
    kapt(Dependencies.DaggerHilt.hiltAndroidKapt)
}
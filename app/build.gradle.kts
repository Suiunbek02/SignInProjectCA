
plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)

    // Kapt
    kotlin (Plugins.kapt)
    // Hilt
    id (Plugins.hilt)
}

android {
    namespace = Config.applicationId
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.compileAndTargetSdk
        versionCode =Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        debug {
            buildConfigField("String", "BASE_URL", "\"https://rickandmortyapi.com/\"")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
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

    //kotlin_activity
    implementation(Dependencies.KotlinActivity.activityKtx)

    //kotlin_fragment
    implementation(Dependencies.KotlinFragment.fragmentKtx)

    //Hilt
    implementation(Dependencies.DaggerHilt.daggerHilt)
    kapt(Dependencies.DaggerHilt.hiltAndroidKapt)

    // Kotlin_activity
    implementation(Dependencies.KotlinActivity.activityKtx)

    // Kotlin_fragment
    implementation(Dependencies.KotlinFragment.fragmentKtx)

    //Domain
    implementation(project(":domain"))

    //Data
    implementation(project(":data"))

    //Presentation
    implementation(project(":presentation"))
}
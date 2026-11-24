
plugins {
    alias(libs.plugins.android.application)
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.focusguard"

    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.focusguard"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        viewBinding = true
    }
}


dependencies {
    // Android Core
    implementation(libs.androidxActivityKtx)
    implementation(libs.androidxAppcompat)
    implementation(libs.androidxConstraintlayout)
    implementation(libs.androidxCoreKtx)
    implementation(libs.material)

    // Retrofit + Gson
    implementation(libs.retrofitCore)
    implementation(libs.retrofitGson)
    implementation(libs.gson)

    // WorkManager
    implementation(libs.workRuntime)

    // Lifecycle
    implementation(libs.lifecycleViewmodel)
    implementation(libs.lifecycleLivedata)
    implementation(libs.lifecycleRuntime)
    implementation(libs.lifecycleSavedstate)

    // Firebase
    implementation(platform(libs.firebaseBom))
    implementation(libs.firebaseFirestore)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidxEspressoCore)
    androidTestImplementation(libs.androidxJunit)
}

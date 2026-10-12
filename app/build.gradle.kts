plugins {
    id("com.android.application")
}

android {
    // Change this to your own unique ID before publishing, e.g. com.yourname.ludo
    namespace = "com.fourcorners.ludo"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.fourcorners.ludo"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}


plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.nova.launcher"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.nova.launcher"
        minSdk = 24
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}

kotlin {
    jvmToolchain(17)
}

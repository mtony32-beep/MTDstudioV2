plugins {
    id("com.android.application")
    kotlin("android")
}
android {
    namespace = "com.mtdstudio.v2"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.mtdstudio.v2"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.4.2")
}

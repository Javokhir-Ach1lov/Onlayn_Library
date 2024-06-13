plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")

}

android {
    namespace = "uz.javokhir_apps.onlaynlibrary"
    compileSdk = 34

    defaultConfig {
        applicationId = "uz.javokhir_apps.onlaynlibrary"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures{
  viewBinding=true
    }
    dataBinding {
        enable = true
    }
}

dependencies {
    implementation("com.airbnb.android:lottie:4.2.0" )
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-firestore:24.10.2")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("androidx.activity:activity:1.8.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.google.firebase:firebase-messaging:23.4.0")
    implementation("com.google.firebase:firebase-firestore-ktx:24.10.0")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation("androidx.media3:media3-exoplayer:1.2.1")
    implementation("androidx.media3:media3-exoplayer-dash:1.2.1")
    implementation("androidx.media3:media3-ui:1.2.1")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.itextpdf:itextpdf:5.5.13")
    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.22")
    implementation("com.android.support:cardview-v7:28.0.0-rc02")
    implementation("com.github.barteksc:android-pdf-viewer:2.8.2")
    implementation ("com.android.support:design:28.0.0-alpha3")
    implementation ("com.google.android.gms:play-services-ads:20.5.0")
    implementation ("com.github.barteksc:android-pdf-viewer:3.2.0-beta.1")
    implementation ("com.google.android.gms:play-services-ads:20.1.0")

}
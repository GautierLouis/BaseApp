
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = Version.appName
    compileSdk = Version.targetSDK

    defaultConfig {
        applicationId = Version.appName
        minSdk = Version.minSDK
        targetSdk = Version.targetSDK
        versionCode = Version.versiobCode
        versionName = Version.versionName

        testInstrumentationRunner = DepsTest.instrumentationRunner
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.kotlinCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Deps.kotlinCore)

    implementation(platform(Deps.kotlinBom))

    implementation(Deps.lifecycle)
    implementation(Deps.composeActivity)

    implementation(platform(Deps.composeBom))
    implementation(Deps.composeUI)
    implementation(Deps.composeUIGraphics)
    implementation(Deps.composeUIToolingPreview)
    implementation(Deps.composeUIMaterial3)

    testImplementation(DepsTest.jUnit)
    androidTestImplementation(DepsTest.jUnitAndroid)
    androidTestImplementation(DepsTest.espresso)

    androidTestImplementation(platform(Deps.composeBom))
    androidTestImplementation(DepsTest.composeJUnit)
    debugImplementation(DepsTest.composeUITooling)
    debugImplementation(DepsTest.composeUIManifest)
}
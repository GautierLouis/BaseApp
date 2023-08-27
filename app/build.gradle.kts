
plugins {
    id("com.android.application")
    id("com.louis.deps")

}

android {
    namespace = "com.louis.baseapp"
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.kotlinCompiler
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":feature:login"))

    implementation(platform(Deps.kotlinBom))

    implementation(Deps.lifecycle)
    implementation(Deps.composeActivity)

    implementation(platform(Deps.composeBom))
    implementation(Deps.composeUI)
    implementation(Deps.composeUIGraphics)
    implementation(Deps.composeUIToolingPreview)
    implementation(Deps.composeUIMaterial3)
    implementation(Deps.composeNavigation)
    implementation(Deps.accompanistSystemController)

    androidTestImplementation(platform(Deps.composeBom))
    androidTestImplementation(DepsTest.composeJUnit)
    debugImplementation(DepsTest.composeUITooling)
    debugImplementation(DepsTest.composeUIManifest)
}
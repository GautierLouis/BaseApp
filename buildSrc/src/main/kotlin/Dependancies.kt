object Version {
    const val appName = "com.louis.baseapp"

    const val kotlin = "1.8.20"
    const val kotlinCompiler = "1.3.2"
    const val gradle = "8.1.0-rc01"

    const val targetSDK = 33
    const val minSDK = 26

    const val versiobCode = 1
    const val versionName = "1.0"


    const val kotlinBom = "1.8.0"
    const val composeBom = "2022.10.00"
    const val kotlinKtx = "1.10.1"

    const val lifecycle = "2.3.1"
    const val composeActivity = "1.5.1"
    const val koin = "3.4.2"
    const val koinCompose = "3.4.5"
}

object Deps {
    const val kotlinCore = "androidx.core:core-ktx:${Version.kotlinKtx}"
    const val kotlinBom = "org.jetbrains.kotlin:kotlin-bom:${Version.kotlinBom}"
    const val composeBom = "androidx.compose:compose-bom:${Version.composeBom}"

    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"

    const val composeUI = "androidx.compose.ui:ui"
    const val composeUIGraphics = "androidx.compose.ui:ui-graphics"
    const val composeUIToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val composeUIMaterial3 = "androidx.compose.material3:material3"
    const val composeActivity = "androidx.activity:activity-compose:${Version.composeActivity}"

    const val koin = "io.insert-koin:koin-android:${Version.koin}"
    const val koinWorkManager = "io.insert-koin:koin-androidx-workmanager:${Version.koin}"
    const val koinCompose = "io.insert-koin:koin-androidx-compose:${Version.koinCompose}"
    const val koinComposeNavigation = "io.insert-koin:koin-androidx-compose-navigation:${Version.koinCompose}"

}

object DepsTest {
    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val composeJUnit = "androidx.compose.ui:ui-test-junit4"
    const val composeUITooling = "androidx.compose.ui:ui-tooling"
    const val composeUIManifest = "androidx.compose.ui:ui-test-manifest"

    const val jUnit = "junit:junit:4.13.2"
    const val jUnitAndroid = "androidx.test.ext:junit:1.1.5"
    const val espresso = "androidx.test.espresso:espresso-core:3.5.1"

    const val koinTest = "io.insert-koin:koin-android-test:${Version.koin}"
    const val jUnit4Koin = "io.insert-koin:koin-test-junit4:${Version.koin}"
    const val jUnit5Koin = "io.insert-koin:koin-test-junit5:${Version.koin}"
}


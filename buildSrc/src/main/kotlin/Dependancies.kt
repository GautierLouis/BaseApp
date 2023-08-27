object Version {
    const val appName = "com.louis.baseapp"

    const val kotlin = "1.9.0"
    const val kotlinCompiler = "1.5.0"
    const val gradle = "8.1.0-rc01"

    const val targetSDK = 33
    const val minSDK = 26

    const val versiobCode = 1
    const val versionName = "1.0"

    const val kotlinBom = "1.8.0"
    const val composeBom = "2023.06.01"
    const val kotlinKtx = "1.10.1"

    const val lifecycle = "2.3.1"
    const val composeActivity = "1.5.1"
    const val koin = "3.4.2"
    const val koinCompose = "3.4.5"

    const val ktor = "2.3.2"

    const val dateTime = "0.4.0"

    const val roomVersion = "2.5.0"

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
    const val composeRuntime = "androidx.compose.runtime:runtime"
    const val accompanistSystemController = "com.google.accompanist:accompanist-systemuicontroller:0.27.0"
    const val accompanistPager = "com.google.accompanist:accompanist-pager-indicator:0.30.1"
    const val composeNavigation = "androidx.navigation:navigation-compose:2.6.0"

    const val koin = "io.insert-koin:koin-android:${Version.koin}"
    const val koinWorkManager = "io.insert-koin:koin-androidx-workmanager:${Version.koin}"
    const val koinCompose = "io.insert-koin:koin-androidx-compose:${Version.koinCompose}"
    const val koinComposeNavigation = "io.insert-koin:koin-androidx-compose-navigation:${Version.koinCompose}"

    const val ktorCore = "io.ktor:ktor-client-core:${Version.ktor}"
    const val ktorEngine = "io.ktor:ktor-client-okhttp:${Version.ktor}"
    const val ktorLogging = "io.ktor:ktor-client-logging:${Version.ktor}"
    const val ktorAuth = "io.ktor:ktor-client-auth:${Version.ktor}"
    const val ktorSerialization = "io.ktor:ktor-serialization-kotlinx-json:${Version.ktor}"
    const val ktorContentNegotiation = "io.ktor:ktor-client-content-negotiation:${Version.ktor}"

    const val moshi = "com.squareup.moshi:moshi-kotlin:1.14.0"

    const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime-jvm:${Version.dateTime}"

    const val roomRuntime = "androidx.room:room-runtime:${Version.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.roomVersion}"
    const val roomKsp = "androidx.room:room-compiler:${Version.roomVersion}"
    const val roomKtx = "androidx.room:room-ktx:${Version.roomVersion}"
    const val roomGuava = "androidx.room:room-guava:${Version.roomVersion}"
    const val roomPaging = "androidx.room:room-paging:${Version.roomVersion}"

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

    const val ktorMock = "io.ktor:ktor-client-mock:${Version.ktor}"

    const val roomTest = "androidx.room:room-testing:${Version.roomVersion}"

}


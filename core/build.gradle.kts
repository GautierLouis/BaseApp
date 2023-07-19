plugins {
    id("com.android.library")
    id("com.louis.deps")
}

android {
    namespace = "com.louis.core"
    buildTypes {
        getByName("debug") {
            enableUnitTestCoverage = true
            enableAndroidTestCoverage = true
        }
    }
}
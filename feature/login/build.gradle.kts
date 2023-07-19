plugins {
    id("com.android.library")
    id("com.louis.deps")
}

android {
    namespace = "com.louis.feature.login"

}

dependencies {
    implementation(project(":core"))
}
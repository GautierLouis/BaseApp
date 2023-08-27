plugins {
    id("com.android.library")
    id("com.louis.deps")
}

android {
    namespace = "com.louis.core"

}

dependencies {
    api(project(":data:network"))
}
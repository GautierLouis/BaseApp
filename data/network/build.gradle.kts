plugins {
    id("com.android.library")
    id("com.louis.deps")
}

android {
    namespace = "com.louis.network"
}

dependencies {

    implementation(Deps.ktorCore)
    implementation(Deps.ktorEngine)
    implementation(Deps.ktorAuth)
    implementation(Deps.ktorSerialization)
    implementation(Deps.ktorContentNegotiation)
    implementation(Deps.ktorLogging)

    testImplementation(DepsTest.ktorMock)
}
plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("depsModule") {
            id = "com.louis.deps"
            implementationClass = "DepsPlugin"
        }
    }
}

dependencies {
    compileOnly(gradleApi())
    implementation("com.android.tools.build:gradle:8.0.2")
    implementation(kotlin("gradle-plugin", "1.8.20"))
}


import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class DepsPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // Apply Required Plugins.
        project.plugins.apply("kotlin-android")

        // Configure common android build parameters.
        val androidExtension = project.extensions.getByName("android")
        if (androidExtension is BaseExtension) {
            androidExtension.apply {
                compileSdkVersion(Version.targetSDK)
                defaultConfig {
                    targetSdk = Version.targetSDK
                    minSdk = Version.minSDK

                    versionCode = Version.versiobCode
                    versionName = Version.versionName

                    testInstrumentationRunner = DepsTest.instrumentationRunner
                }

                // Configure common proguard file settings.
                val proguardFile = "proguard-rules.pro"
                when (this) {
                    is LibraryExtension -> defaultConfig {
                        consumerProguardFiles(proguardFile)
                    }

                    is AppExtension -> buildTypes {
                        getByName("release") {
                            isMinifyEnabled = true
                            isShrinkResources = true
                            proguardFiles(
                                getDefaultProguardFile("proguard-android-optimize.txt"),
                                proguardFile
                            )
                        }
                    }
                }
                // configure Java 17
                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_17
                    targetCompatibility = JavaVersion.VERSION_17
                }
                project.tasks.withType(KotlinCompile::class.java).configureEach {
                    kotlinOptions {
                        jvmTarget = JavaVersion.VERSION_17.toString()
                    }
                }

                // Adds required dependencies for all modules.
                project.dependencies {
                    add("implementation", Deps.kotlinCore)

                    add("implementation", Deps.koin)

                    add("testImplementation", DepsTest.jUnit)
                    add("androidTestImplementation", DepsTest.jUnitAndroid)
                    add("androidTestImplementation", DepsTest.espresso)
                }
            }
        }

    }
}
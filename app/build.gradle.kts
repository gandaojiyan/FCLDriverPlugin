plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.mio.plugin.renderer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mio.plugin.renderer"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
        configureEach {
            //应用名
            //app name
            resValue("string","app_name","PanVK 26.3")
            //包名后缀（每个驱动唯一，多个插件可共存）
            //package name Suffix (unique per driver so multiple plugins can coexist)
            applicationIdSuffix = ".panvk263"

            manifestPlaceholders["driver"] = "PanVK 26.3"
            manifestPlaceholders["driverLib"] = "libvulkan_panfrost.so"
            manifestPlaceholders["driverGpu"] = "mali"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
}

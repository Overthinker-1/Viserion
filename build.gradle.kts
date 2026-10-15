plugins {
    id("com.android.application")
    id("kotlin-android")
}

ext {
    extName = "MegaHentai"
    pkgNameSuffix = "megahentai"
    extClass = ".MegaHentai"
    extVersionCode = 1
    libVersion = "1.4"
}

apply(from = "$rootDir/common.gradle")

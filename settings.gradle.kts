rootProject.name = "paradox-kotlin-dsl"

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        id("org.jetbrains.kotlin.jvm") version kotlinVersion
    }
}
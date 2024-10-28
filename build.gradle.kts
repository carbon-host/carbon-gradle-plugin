plugins {
    kotlin("jvm") version "1.7.10"
    `java-gradle-plugin`
    `kotlin-dsl`
    id("com.gradle.plugin-publish") version "1.2.1"
}

group = "host.carbon"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(kotlin("test"))
}

pluginBundle {
    website = "https://carbon.host"
    vcsUrl = "https://github.com/carbon-host/carbon-gradle-plugin.git"
    tags = listOf("carbon", "cli", "deployment")
}

gradlePlugin {
    plugins {
        create("carbonPlugin") {
            id = "host.carbon.gradle"
            implementationClass = "host.carbon.gradle.CarbonPlugin"
            displayName = "Carbon Gradle Plugin"
            description = "A Gradle plugin for running Carbon CLI commands"
        }
    }
}
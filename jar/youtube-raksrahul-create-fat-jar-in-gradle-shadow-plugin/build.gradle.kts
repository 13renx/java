plugins {
    id("java")
    id("com.gradleup.shadow") version "9.6.1"
}

group = "fat.jar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.apache.commons:commons-lang3:3.18.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.build {
    dependsOn(tasks.shadowJar)
}

tasks.shadowJar {
    manifest {
        attributes["Main-Class"] = "fat.jar.Main"
    }
}
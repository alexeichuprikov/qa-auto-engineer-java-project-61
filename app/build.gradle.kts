plugins {
    id("application")
    id("checkstyle")
}

checkstyle {
    toolVersion = "10.12.5"
}

application {
    mainClass = "hexlet.code.App"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.14.0")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
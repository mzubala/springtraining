plugins {
    java
    id("org.springframework.boot") version "3.1.5"
    id("io.freefair.lombok") version "8.4"
}

apply(plugin = "io.spring.dependency-management")

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
}

plugins {
    id("java")
}

group = "org.theory"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.hibernate.orm:hibernate-core:6.5.2.Final")
    implementation("org.postgresql:postgresql:42.2.18")
    implementation("com.vladmihalcea:hibernate-types-52:2.21.1")
    implementation("org.slf4j:slf4j-api:2.0.13")


    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
}

tasks.test {
    useJUnitPlatform()
}
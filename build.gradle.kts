plugins {
    application
}
group = "org.theory"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hibernate.orm:hibernate-core:6.5.2.Final")
    implementation("org.postgresql:postgresql:42.2.18")
    implementation("com.vladmihalcea:hibernate-types-52:2.21.1")
    implementation("org.slf4j:slf4j-api:2.0.13")
    implementation("jakarta.annotation:jakarta.annotation-api:3.0.0")

    implementation("org.springframework:spring-core:6.1.11")
    implementation("org.springframework:spring-context:6.1.11")


    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.26.3")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "org.theory.spring_std.dependency_injection.exmpl_2.CarAppRunner"
}
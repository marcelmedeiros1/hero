plugins {
    id("java")
    id("application")
}

application {
    mainClass.set("Application")
}
group = "org.marcelmedeiros1.hero"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    //https://mvnrepository.com/artifact/com.googlecode.lanterna/lanterna
    implementation("com.googlecode.lanterna", "lanterna", "3.1.1")
}

tasks.test {
    useJUnitPlatform()
}
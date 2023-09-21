plugins {
    id("java")
    `maven-publish`
}

group = "es.hyrex.hyrexanimations"
version = "1.1.0"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("org.jetbrains:annotations:24.0.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withJavadocJar()
    withSourcesJar()
}

configure<PublishingExtension> {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}

tasks.withType<Javadoc> {
    destinationDir = file("docs")
    (options as StandardJavadocDocletOptions).links(
        "https://docs.oracle.com/en/java/javase/11/docs/api/",
        "https://jd.papermc.io/paper/1.16/",
        "https://javadoc.io/doc/org.jetbrains/annotations/latest/"
    )
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
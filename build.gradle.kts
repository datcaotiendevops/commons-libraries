plugins {
    `java-library`
    `maven-publish`
}

group = "com.datcaotiendevops"
version = "1.0.0"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = "com.datcaotiendevops"
            artifactId = "commons-libraries"
            version = project.version.toString()
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"

            url = uri(
                "https://maven.pkg.github.com/datcaotiendevops/github-packages-registry"
            )

            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_PACKAGES_TOKEN")
            }
        }
    }
}
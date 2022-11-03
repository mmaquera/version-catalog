group = "com.mmaquera"
version = "1.0.0"
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    `maven-publish`
    `version-catalog`
}

catalog {
    versionCatalog {
        from(files("dependencies.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("dependencies"){
            from(components["versionCatalog"])
        }
    }
}
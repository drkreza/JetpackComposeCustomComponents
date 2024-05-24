@file:Suppress("MemberVisibilityCanBePrivate")

object AndroidConfiguration {

    const val minSdk = 23
    const val compileSdk = 34
    const val targetSdk = compileSdk

    const val appId = "drk.reza.example"
    const val versionCode = 73
    const val versionName = "5.3.0"

    private const val branch = "master"
    const val appHost = "app"
    const val baseUrl = "\"https://github.com/Vivecstel/Jetpack-Compose-Playground/blob/$branch/" +
            "app/src/main/java/com/steleot/jetpackcompose/playground/compose/\""

    const val releaseName = "$versionCode ($versionName)"
    const val serviceAccountCredentials = "jetpack-compose-playground-play-publishing.json"
    const val artifactFile = "build/outputs/bundle/release/app-release.aab"
    const val track = "production"
    const val updatePriority = 2
}

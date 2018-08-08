package io.vithor.archi.common

actual class Platform actual constructor() {
    actual val name: String
        get() = "JS"

}

actual fun getPlatform() = Platform()
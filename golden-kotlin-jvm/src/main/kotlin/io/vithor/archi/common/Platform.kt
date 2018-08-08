package io.vithor.archi.common

actual class Platform actual constructor() {
    actual val name: String = "Backend"

}

actual fun getPlatform() = Platform()
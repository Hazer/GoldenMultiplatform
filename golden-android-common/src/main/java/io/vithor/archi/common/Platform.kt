package io.vithor.archi.common

actual class Platform actual constructor() {
    actual val name: String = "Droid"
}

actual fun getPlatform(): Platform = Platform()
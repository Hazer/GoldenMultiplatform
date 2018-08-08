package io.vithor.archi.common

actual class Platform actual constructor() {
    actual val name: String = "iOS"
}

actual fun getPlatform(): Platform = Platform()
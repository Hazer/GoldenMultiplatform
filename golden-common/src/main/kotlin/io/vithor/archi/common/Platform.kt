package io.vithor.archi.common

expect class Platform() {
    val name: String
}

expect fun getPlatform(): Platform
package io.vithor.golden.jvm

import io.vithor.archi.common.getPlatform

fun main(args: Array<String>) {
    println("Platform: ${getPlatform().name}")
}
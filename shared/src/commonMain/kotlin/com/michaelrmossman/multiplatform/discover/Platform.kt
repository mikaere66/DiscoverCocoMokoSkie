package com.michaelrmossman.multiplatform.discover

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
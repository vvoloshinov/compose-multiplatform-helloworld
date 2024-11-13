package org.vvoloshinov.composemultiplatformhelloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
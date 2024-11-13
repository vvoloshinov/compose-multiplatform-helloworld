package org.vvoloshinov.composemultiplatformhelloworld

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeMultiPlatformHelloWorld",
    ) {
        App()
    }
}
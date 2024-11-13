package org.vvoloshinov.composemultiplatformhelloworld

import platform.UIKit.UIDevice

class IOSPlatform : Platform {
    override val name: String =
        "I am iOS: so - " + UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()
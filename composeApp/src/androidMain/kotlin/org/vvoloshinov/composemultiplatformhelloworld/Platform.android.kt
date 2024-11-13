package org.vvoloshinov.composemultiplatformhelloworld

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "I am Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
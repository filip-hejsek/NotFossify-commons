package org.fossify.commons.extensions

import android.content.Context
import org.fossify.commons.R
import org.fossify.commons.helpers.*
import java.io.File

fun Context.getTempFile(filename: String = DEFAULT_FILE_NAME): File? {
    val folder = File(cacheDir, "contacts")
    if (!folder.exists()) {
        if (!folder.mkdir()) {
            toast(R.string.unknown_error_occurred)
            return null
        }
    }

    return File(folder, filename)
}

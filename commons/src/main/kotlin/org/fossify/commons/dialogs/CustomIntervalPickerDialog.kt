package org.fossify.commons.dialogs

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import org.fossify.commons.R
import org.fossify.commons.extensions.*
import org.fossify.commons.helpers.DAY_SECONDS
import org.fossify.commons.helpers.HOUR_SECONDS
import org.fossify.commons.helpers.MINUTE_SECONDS

private fun initialSelection(selectedSeconds: Int, context: Context) = requireNotNull(
    when {
        selectedSeconds == 0 -> minutesRaw(context)
        selectedSeconds % DAY_SECONDS == 0 -> daysRaw(context)
        selectedSeconds % HOUR_SECONDS == 0 -> hoursRaw(context)
        selectedSeconds % MINUTE_SECONDS == 0 -> minutesRaw(context)
        else -> secondsRaw(context)

    }
) {
    "Incorrect format, please check selections"
}

private fun daysRaw(context: Context) = context.getString(R.string.days_raw)

private fun hoursRaw(context: Context) = context.getString(R.string.hours_raw)

private fun secondsRaw(context: Context) = context.getString(R.string.seconds_raw)

private fun minutesRaw(context: Context) = context.getString(R.string.minutes_raw)

package com.zas.scoreboard.common

import android.app.Activity
import android.content.res.Resources
import android.util.DisplayMetrics
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity


fun dpToPx(r: Resources, dp: Float): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.displayMetrics)
}

fun spToPx(r: Resources, dp: Float): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, dp, r.displayMetrics)
}

fun getScreenWidth(activity: Activity): Float {
    val displayMetrics = DisplayMetrics()
    activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
    return displayMetrics.widthPixels.toFloat()
}
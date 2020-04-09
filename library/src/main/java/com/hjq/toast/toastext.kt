package com.hjq.toast

/**
 *  author: Tim Chen
 *  time  : 2020-04-09
 *  desc  :
 */
import android.app.Activity
import android.content.Context

inline fun Activity.toastMe(message: CharSequence) = ToastUtils.show(message)

inline fun Context.toastMe(message: CharSequence) = ToastUtils.show(message)
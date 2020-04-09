package com.hjq.toast

import android.app.Activity
import android.content.Context

/**
 *  author: Tim Chen
 *  time  : 2020-04-09
 *  desc  :
 */
inline fun Activity.toastMe(message: CharSequence) = ToastUtils.show(message)

inline fun Context.toastMe(message: CharSequence) = ToastUtils.show(message)
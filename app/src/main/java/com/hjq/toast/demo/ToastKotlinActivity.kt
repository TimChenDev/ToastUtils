package com.hjq.toast.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hjq.toast.toastMe
import kotlinx.android.synthetic.main.activity_toast_kotlin.*

class ToastKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_kotlin)

        btnShow.setOnClickListener {
            toastMe("2;obkv8jyu54v8")
        }
    }
}

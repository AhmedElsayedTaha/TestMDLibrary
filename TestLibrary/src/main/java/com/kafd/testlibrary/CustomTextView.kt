package com.kafd.testlibrary

import android.content.Context
import android.widget.FrameLayout

class CustomTextView(private val context: Context): FrameLayout(context) {
    init {
        val textView = android.widget.TextView(context)
        textView.text = "Hello World"
        addView(textView)
    }
}
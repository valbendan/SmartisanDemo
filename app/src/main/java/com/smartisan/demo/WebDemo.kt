package com.smartisan.demo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_demo)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onStart() {
        super.onStart()

        val wv = findViewById<WebView>(R.id.wv_2)
        requireNotNull(wv)

        wv.settings.javaScriptEnabled = true
        wv.loadUrl("https://dabaichi.hackernav.com")
    }
}
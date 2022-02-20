package com.salaheddine.chnitifa.kmmtest.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.salaheddine.chnitifa.kmmtest.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val btn : Button= findViewById(R.id.button)
       
    }
}

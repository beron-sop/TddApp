package com.example.tddapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity3)

        val clicked = intent.getStringExtra("clicked") ?: ""
        findViewById<TextView>(R.id.resultText).text = "You clicked $clicked"
    }
}

package com.example.tddapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1)

        val input = findViewById<EditText>(R.id.numberEdit)
        val btn = findViewById<Button>(R.id.goButton)

        btn.setOnClickListener {
            val n = input.text.toString().toIntOrNull() ?: 0
            val i = Intent(this, Activity2::class.java)
            i.putExtra("count", n)
            startActivity(i)
        }
    }
}

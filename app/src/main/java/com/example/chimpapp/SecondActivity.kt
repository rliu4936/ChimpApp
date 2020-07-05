package com.example.chimpapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val back = findViewById<Button>(R.id.button2)
        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
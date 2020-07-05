package com.example.chimpapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.startButton)
        val textView = findViewById<TextView>(R.id.textView)
        button.setOnClickListener{
            textView.text = (0..100).random().toString()
        }
    }
}
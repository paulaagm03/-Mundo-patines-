package com.example.inicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inscribirse: Button = findViewById(R.id.button1)
        inscribirse.setOnClickListener {
            val intent: Intent = Intent(this, Login:: class.java)
            startActivity(intent)
        }
    }
}
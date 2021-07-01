package com.example.wisatamakassar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnWisata = findViewById<Button>(R.id.btn_wisata)
        val btnAbout = findViewById<Button>(R.id.btn_about)
        val btnExit = findViewById<Button>(R.id.btn_exit)

        btnWisata.setOnClickListener {
            val intent = Intent(this, ListWisataActivity::class.java)
            startActivity(intent)
        }

        btnAbout.setOnClickListener {

        }

        btnExit.setOnClickListener {

        }
    }
}
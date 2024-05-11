package com.example.tpcalculcyber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    lateinit var back: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        back = findViewById(R.id.btn_back)

        back.setOnClickListener {
            back()
        }
    }


    fun back() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

package com.example.tpcalculcyber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var n1: EditText
    lateinit var n2: EditText
    lateinit var btn_somme: Button
    lateinit var btn_mult: Button
    lateinit var btn_min: Button
    lateinit var btn_div: Button
    lateinit var result: TextView
    lateinit var next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        n1 = findViewById(R.id.et_n1)
        n2 = findViewById(R.id.et_n2)
        btn_somme = findViewById(R.id.btn_somme)
        btn_mult = findViewById(R.id.btn_mult)
        btn_min = findViewById(R.id.btn_min)
        btn_div = findViewById(R.id.btn_div)
        result = findViewById(R.id.tv_result)
        next = findViewById(R.id.btn_next)
        somme()
        mult()
        min()
        div()
        next.setOnClickListener {
            next()
        }


    }

    fun somme() {
        btn_somme.setOnClickListener {
            if (n1.text.toString().isNullOrEmpty() || n2.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "values missing", Toast.LENGTH_SHORT).show()
            } else {
                val intN1 = n1.text.toString().toInt()
                val intN2 = n2.text.toString().toInt()
                result.text = (intN1 + intN2).toString()
            }
        }
    }

    fun mult() {
        btn_mult.setOnClickListener {
            if (n1.text.toString().isNullOrEmpty() || n2.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "values missing", Toast.LENGTH_SHORT).show()
            } else {
                val intN1 = n1.text.toString().toInt()
                val intN2 = n2.text.toString().toInt()
                result.text = (intN1 * intN2).toString()
            }
        }
    }

    fun min() {
        btn_min.setOnClickListener {
            if (n1.text.toString().isNullOrEmpty() || n2.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "values missing", Toast.LENGTH_SHORT).show()
            } else {
                val intN1 = n1.text.toString().toInt()
                val intN2 = n2.text.toString().toInt()
                result.text = (intN1 - intN2).toString()
            }
        }
    }

    fun div() {
        btn_div.setOnClickListener {
            if (n1.text.toString().isNullOrEmpty() || n2.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "values missing", Toast.LENGTH_SHORT).show()
            } else {
                val intN1 = n1.text.toString().toInt()
                val intN2 = n2.text.toString().toInt()
                result.text = (intN1 / intN2).toString()
            }
        }
    }

    fun next() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}
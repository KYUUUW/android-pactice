package com.example.android_practice

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Toast.makeText(applicationContext, "Button pushed", Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            val input1 = input1.text.toString()
            output1.text = "결과: $input1"
        }
    }

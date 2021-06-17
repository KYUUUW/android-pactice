package com.example.a02_basic_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name: String? = null
    lateinit var mobile: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val nameLength = name?.length ?: 0

            println(nameLength)

            name  = nameInput.text.toString()
            mobile = moblieInput.text.toString()

            println("안녕: $name")
            println(mobile)

            Toast.makeText(applicationContext, "asdf", Toast.LENGTH_LONG).show()
        }
    }
}
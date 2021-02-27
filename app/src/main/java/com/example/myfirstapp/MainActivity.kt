package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photo = photo ("ejemplo", "10/09/2018", "des ejemplo")
            button.setOnClickListener {
            if (texto.text.toString() == "BabyMat") {
                texto.text = photo.fecha
            }else {
                texto.text = "BabyMat"
            }
        }
    }
}
package com.example.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val clickedButtonDisplayView = findViewById<TextView>(R.id.clickedButtonView)

    val redButtonView = findViewById<TextView>(R.id.redButton)

    val greenButtonView = findViewById<TextView>(R.id.greenButton)

    val blueButtonView = findViewById<TextView>(R.id.blueButton)


   redButtonView.setOnClickListener{
            clickedButtonDisplayView.text ="Red was clicked"
        }

   greenButtonView.setOnClickListener{
            clickedButtonDisplayView.text ="Green was clicked"
        }

   blueButtonView.setOnClickListener{
            clickedButtonDisplayView.text ="Blue was clicked"
        }
    }
}
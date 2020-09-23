package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            Toast.makeText(
                this,
                "This is a toast.",
                Toast.LENGTH_LONG).show()
        }
        button2.setOnClickListener {
            var count: Int = textView3.text.toString().toInt()
            count +=1
            textView3.text = count.toString()
        }
        button3.setOnClickListener {
            var randomNum: Int =(0..100).random()
            textView3.text= randomNum.toString()
        }

    }
}

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.support.v4.app.INotificationSideChannel
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        textView.setText("Input Text : ")

        var editText = findViewById<TextView>(R.id.editText)
        editText.setText("")

        var upperLowerButton = findViewById<TextView>(R.id.upperLowerButton)
        upperLowerButton.setText("UPPER/LOWER")

        var charCount = findViewById<TextView>(R.id.charCount)
        charCount.setText("COUNT CHARACTER")

        var textView2 = findViewById<TextView>(R.id.textView2)
        textView2.setText("Uppercase/Lowercase : ")

        var textUpperLower = findViewById<TextView>(R.id.textUpperLower)
        textUpperLower.setText("")

        var textView3 = findViewById<TextView>(R.id.textView3)
        textView3.setText("Count : ")

        var countChar = findViewById<TextView>(R.id.countChar)
        countChar.setText("")

        textUpperLower?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
//                val textUpperLower textUpperLower.setText("")
                textUpperLower?.append("123")


            }
        })
    }
}

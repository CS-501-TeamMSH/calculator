package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonPlus = findViewById<Button>(R.id.showInput)
        val buttonMinus = findViewById<Button>(R.id.showInput2)
        val buttonMultiply = findViewById<Button>(R.id.showInput3)
        val buttonDivide = findViewById<Button>(R.id.showInput4)

    }



}
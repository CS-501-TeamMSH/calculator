package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.editText) as EditText
        val number2 = findViewById<EditText>(R.id.editText2) as EditText
        val resultView = findViewById<TextView>(R.id.editText3) as TextView
        val btnSum = findViewById<Button>(R.id.showInput) as Button

        val btnSub = findViewById<Button>(R.id.showInput2) as Button
        val btnMul = findViewById<Button>(R.id.showInput3) as Button
        val btnDivide = findViewById<Button>(R.id.showInput4) as Button
        val btnMod = findViewById<Button>(R.id.showInput5) as Button

        //btnclick Event

        btnSum.setOnClickListener {

            val input1 = number1.text.toString()
            val input2 = number2.text.toString()

            if (input1.isEmpty() || input2.isEmpty()) {
                resultView.text = "Both fields are required!"
            }

            else{

                val n1 = number1.text.toString().toFloat()
                val n2 = number2.text.toString().toFloat()


                val result = n1 + n2
                resultView.text = result.toString()

            }

        }

        btnSub.setOnClickListener {

            val input1 = number1.text.toString()
            val input2 = number2.text.toString()

            if (input1.isEmpty() || input2.isEmpty()) {
                resultView.text = "Both fields are required!"
            }

            else
            {

                val n1 = number1.text.toString().toFloat()
                val n2 = number2.text.toString().toFloat()

                val result = n1 - n2
                resultView.text = result.toString()

            }

        }

        btnMul.setOnClickListener {


            val input1 = number1.text.toString()
            val input2 = number2.text.toString()

            if (input1.isEmpty() || input2.isEmpty()) {
                resultView.text = "Both fields are required!"
            }
            else{

                val n1 = number1.text.toString().toFloat()
                val n2 = number2.text.toString().toFloat()

                val result = n1 * n2
                resultView.text = result.toString()
            }

        }

        btnDivide.setOnClickListener {

            val input1 = number1.text.toString()
            val input2 = number2.text.toString()

            if (input1.isEmpty() || input2.isEmpty()) {
                resultView.text = "Both fields are required!"
            }

            else{
                val n1 = number1.text.toString().toFloat()
                val n2 = number2.text.toString().toFloat()

                val result = n1 / n2

                if ( n2.toInt() == 0 )
                {
                    resultView.text = "Division by 0 is NOT allowed"
                }
                else{
                    resultView.text = result.toString()
                }

            }


        }

        btnMod.setOnClickListener {

            val input1 = number1.text.toString()
            val input2 = number2.text.toString()

            if (input1.isEmpty() || input2.isEmpty()) {
                resultView.text = "Both fields are required!"
            }

            else{
                val n1 = number1.text.toString().toFloat()
                val n2 = number2.text.toString().toFloat()

                val result = n1 % n2

                if (n2.toInt() == 0) {
                    resultView.text = "Modulus by 0 is NOT allowed"
                } else {
                    resultView.text = result.toString()
                }

            }


        }


    }



}
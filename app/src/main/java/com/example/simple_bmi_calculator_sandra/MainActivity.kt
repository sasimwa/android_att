package com.example.simple_bmi_calculator_sandra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var text_calc:TextView
    private lateinit var text_weight:EditText
    private lateinit var text_height:EditText
    private lateinit var text_display:TextView
    private lateinit var submit_button:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_calc = findViewById(R.id.txtcalculator)
        text_weight = findViewById(R.id.edtweight)
        text_height = findViewById(R.id.edtheight)
        text_display = findViewById(R.id.txtdisplay)
        submit_button = findViewById(R.id.btnsubmit)

        submit_button.setOnClickListener {
            var first_num = text_weight.text.toString().trim()
            var second_num = text_height.text.toString().trim()

            if (first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{
                var third_num = second_num.toDouble() * second_num.toDouble()
                var answer = first_num.toDouble() / third_num.toFloat()
                text_display.text = answer.toString()
            }



        }


    }
}
package com.example.sherikafaysontemperatureconversion

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import java.util.Locale

/*
Name: Sherika Fayson
Date: February 5, 2026
*/

class MainActivity : AppCompatActivity() {

    private lateinit var edtTemp: TextInputEditText
    private lateinit var rbFtoC: RadioButton
    private lateinit var rbCtoF: RadioButton
    private lateinit var btnConvert: Button
    private lateinit var txtResultValue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //add icon to action bar
        val actionBar = supportActionBar
        actionBar!!.setIcon(R.mipmap.ic_launcher)
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Hook up views from the XML
        edtTemp = findViewById(R.id.edtTemp)
        rbFtoC = findViewById(R.id.rbFtoC)
        rbCtoF = findViewById(R.id.rbCtoF)
        btnConvert = findViewById(R.id.btnConvert)
        txtResultValue = findViewById(R.id.txtResultValue)

        btnConvert.setOnClickListener {
            convertTemperature()
        }
    }

    private fun convertTemperature() {
        val inputText = edtTemp.text?.toString()?.trim()

        if (inputText.isNullOrEmpty()) {
            Toast.makeText(this, "Please enter a temperature value.", Toast.LENGTH_SHORT).show()
            return
        }

        val inputValue = inputText.toDoubleOrNull()
        if (inputValue == null) {
            Toast.makeText(this, "Invalid number. Please enter a valid temperature.", Toast.LENGTH_SHORT).show()
            return
        }

        if (rbFtoC.isChecked) {
            // °F bounds: -100 to 250
            if (inputValue < -100.0 || inputValue > 250.0) {
                Toast.makeText(this, "Fahrenheit must be between -100 and 250.", Toast.LENGTH_SHORT).show()
                return
            }

            // °F to °C: (°F − 32) * 5/9
            val celsius = (inputValue - 32) * 5.0 / 9.0
            txtResultValue.text = String.format(Locale.getDefault(), "%.2f °C", celsius)

        } else if (rbCtoF.isChecked) {
            // °C bounds: -75 to 125
            if (inputValue < -75.0 || inputValue > 125.0) {
                Toast.makeText(this, "Celsius must be between -75 and 125.", Toast.LENGTH_SHORT).show()
                return
            }

            // °C to °F: (°C × 9/5) + 32
            val fahrenheit = (inputValue * 9.0 / 5.0) + 32
            txtResultValue.text = String.format(Locale.getDefault(), "%.2f °F", fahrenheit)
        }
    }
}

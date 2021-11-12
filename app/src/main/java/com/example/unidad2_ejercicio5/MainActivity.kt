package com.example.unidad2_ejercicio5

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numero = 0
        bComenzar.setOnClickListener {
            numero = ((Math.random() * 5) + 1).toInt()
            tv1.text = ""
            tv1.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            bComenzar.isEnabled = false
            b1.isEnabled = true
            b2.isEnabled = true
            b3.isEnabled = true
            b4.isEnabled = true
            b5.isEnabled = true
            b6.isEnabled = true
        }

        b1.setOnClickListener {
            if (numero == b1.text.toString().toInt()) {
                tv1.text = "Mueres"
                tv1.setBackgroundColor(Color.parseColor("#BD3C12"))
                bComenzar.text = "Volver a jugar"
                bComenzar.isEnabled = true
            }
            else {
                b1.isEnabled = false
            }
        }
        b2.setOnClickListener {
            if (numero == b2.text.toString().toInt()) {
                tv1.text = "Mueres"
                tv1.setBackgroundColor(Color.parseColor("#BD3C12"))
                bComenzar.text = "Volver a jugar"
                bComenzar.isEnabled = true
            }
            else {
                b2.isEnabled = false
            }
        }
        b3.setOnClickListener {
            if (numero == b3.text.toString().toInt()) {
                tv1.text = "Mueres"
                tv1.setBackgroundColor(Color.parseColor("#BD3C12"))
                bComenzar.text = "Volver a jugar"
                bComenzar.isEnabled = true
            }
            else {
                b3.isEnabled = false
            }
        }
        b4.setOnClickListener {
            if (numero == b4.text.toString().toInt()) {
                tv1.text = "Mueres"
                tv1.setBackgroundColor(Color.parseColor("#BD3C12"))
                bComenzar.text = "Volver a jugar"
                bComenzar.isEnabled = true
            }
            else {
                b4.isEnabled = false
            }
        }
        b5.setOnClickListener {
            if (numero == b5.text.toString().toInt()) {
                tv1.text = "Mueres"
                tv1.setBackgroundColor(Color.parseColor("#BD3C12"))
                bComenzar.text = "Volver a jugar"
                bComenzar.isEnabled = true
            }
            else {
                b5.isEnabled = false
            }
        }
        b6.setOnClickListener {
            if (numero == b6.text.toString().toInt()) {
                tv1.text = "Mueres"
                tv1.setBackgroundColor(Color.parseColor("#BD3C12"))
                bComenzar.text = "Volver a jugar"
                bComenzar.isEnabled = true
            }
            else {
                b6.isEnabled = false
            }
        }
    }
}
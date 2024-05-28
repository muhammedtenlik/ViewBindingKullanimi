package com.muhammedtenlik.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muhammedtenlik.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        val araba1=Araba()
        val  araba2=Araba()
        binding.button.setOnClickListener{
            araba1.Marka="Ford"
            araba1.Model="Transit"
            araba1.ÜretimYıl=2012
            binding.textView.text=araba1.Marka +" "+araba1.Model +" " + araba1.ÜretimYıl

        }
        binding.button2.setOnClickListener{
            araba1.Marka="Renault"
            araba1.Model="Clio"
            araba1.ÜretimYıl=2023
            binding.textView.text=araba1.Marka +" "+araba1.Model +" " + araba1.ÜretimYıl
        }
    }
}
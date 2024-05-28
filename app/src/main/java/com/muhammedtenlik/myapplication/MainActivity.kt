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
        //val araba1=Araba()
        //val  araba2=Araba()
        binding.button.setOnClickListener{
        //    araba1.Marka="Ford"
          //  araba1.Model="Transit"s
           // araba1.ÜretimYıl=2012
            //binding.textView.text=araba1.Marka +" "+araba1.Model +" " + araba1.ÜretimYıl
            var araba=Araba("Transit","Ford",2012)
            binding.textView.text=araba.Marka+" "+araba.Model+" "+ araba.ÜretimYıl

        }
        binding.button2.setOnClickListener{
            var araba=Araba("Clio","Renault",2023)
            binding.textView.text=araba.Marka+" "+araba.Model+" "+ araba.ÜretimYıl
            araba.testFonksiyonu()
            araba.ClioMotor=1.3
            println(araba.ClioMotor)
            println(araba.TransitMotorDegis())
        }
    }
}
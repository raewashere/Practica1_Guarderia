package com.example.practica1_guarderia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica1_guarderia.databinding.ActivityMainBinding
import com.example.practica1_guarderia.databinding.ActivityProffesorHomeBinding

class ProffesorHome : AppCompatActivity() {
    private lateinit var binding: ActivityProffesorHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProffesorHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRanitas.setOnClickListener{
            startActivity(Intent(this, ListaIntegrantes::class.java))
        }
        binding.buttonAbejitas.setOnClickListener{
            startActivity(Intent(this, ListaIntegrantes::class.java))
        }
        binding.buttonNutrias.setOnClickListener{
            startActivity(Intent(this, ListaIntegrantes::class.java))
        }

    }
}
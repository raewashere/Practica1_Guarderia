package com.example.practica1_guarderia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica1_guarderia.clases.Usuario
import com.example.practica1_guarderia.databinding.ActivityListaIntegrantesBinding
import com.example.practica1_guarderia.databinding.ActivityProffesorHomeBinding

class ListaIntegrantes : AppCompatActivity() {
    private lateinit var binding: ActivityListaIntegrantesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_integrantes)

        binding = ActivityListaIntegrantesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFulanito.setOnClickListener{
            startActivity(Intent(this, reporte_diario::class.java))
        }
    }
}
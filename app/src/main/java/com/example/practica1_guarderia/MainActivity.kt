package com.example.practica1_guarderia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.practica1_guarderia.clases.Usuario
import com.example.practica1_guarderia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        var listaUsuarios : MutableList<Usuario> = mutableListOf()
        var ejemploUsuario : Usuario = Usuario("profesor","profesor","nombre", "apellido")
        listaUsuarios.add(ejemploUsuario)
        ejemploUsuario = Usuario("padre","padre","nombre", "apellido")
        listaUsuarios.add(ejemploUsuario)

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            //V
            startActivity(Intent(this, ProffesorHome::class.java))
        }



    }
}
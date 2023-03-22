package com.example.practica1_guarderia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.practica1_guarderia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        /*var listaUsuarios : MutableList<Usuario> = mutableListOf()
        var ejemploUsuario : Usuario = Usuario("profesor","profesor","nombre", "apellido")
        listaUsuarios.add(ejemploUsuario)
        ejemploUsuario = Usuario("padre","padre","nombre", "apellido")
        listaUsuarios.add(ejemploUsuario)*/
        data class Usuario(var usuario: String, var password: String)

        val listaUsuarios = listOf(
            Usuario("profesor","profesor"),
            Usuario("padre","padre")
        )
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            //OBTENER USUARIO
            var nUsuario = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.username).text
            //OBTENER PASSWORD
            var password = findViewById<EditText>(R.id.password).text

            var datosUsuario:Usuario = Usuario(nUsuario.toString(),password.toString())

            Toast.makeText(this, password.toString(), Toast.LENGTH_SHORT).show()

            //FUNCION PARA BUSCAR SI EXISTE
            if(listaUsuarios.contains(datosUsuario))
            {
                startActivity(Intent(this, ProffesorHome::class.java))
            }
            else
            {
                Toast.makeText(this, "No entra", Toast.LENGTH_SHORT).show()
            }

        }



    }
}
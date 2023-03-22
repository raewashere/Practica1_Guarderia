package com.example.practica1_guarderia.clases

import android.text.Editable
import android.widget.EditText

open class Usuario(
    var nombreUsuario: String,
    var contraseniaUsuario: String,
    var nombre: String,
    var apellido: String
) {
    val nombre_Usuario : String = nombreUsuario
    val contrasenia_Usuario : String = contraseniaUsuario
    val nom : String =  nombre
    val aP : String = apellido
}
package com.example.inicio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Bienvenida : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val mostrarUsuario = findViewById<TextView >(R.id.mostrarUsuario)
        val recibeUsuario:String = intent.extras?.getString("Extra_MessageUsuario").orEmpty()
        mostrarUsuario.text = recibeUsuario

        val mostrarNombre = findViewById<TextView >(R.id.mostrarNombre)
        val recibeNombre:String = intent.extras?.getString("Extra_MessageNombre").orEmpty()
        mostrarNombre.text = recibeNombre

        val mostraDireccion = findViewById<TextView>(R.id.mostrarDireccion)
        val recibeDireccion:String = intent.extras?.getString("Extra_MessageDireccion").orEmpty()
        mostraDireccion.text = recibeDireccion

        val boton = findViewById<Button>(R.id.boton)
        boton.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}
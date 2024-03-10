package com.example.inicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usuario = findViewById<EditText>(R.id.usuario)
        val nombre = findViewById<EditText>(R.id.nombreCompleto)
        val direccion = findViewById<EditText>(R.id.direccion)
        val aceptar = findViewById<Button>(R.id.aceptar)

        aceptar.setOnClickListener {
            val messageUsuario:String = usuario.text.toString()
            val messageNombre:String = nombre.text.toString()
            val messageDireccion:String = direccion.text.toString()

            val intent = Intent(this,Bienvenida::class.java)
            intent.putExtra("Extra_MessageUsuario",messageUsuario)
            startActivity(intent)
            intent.putExtra("Extra_MessageNombre",messageNombre)
            startActivity(intent)
            intent.putExtra("Extra_MessageDireccion",messageDireccion)
            startActivity(intent)
        }
    }
}
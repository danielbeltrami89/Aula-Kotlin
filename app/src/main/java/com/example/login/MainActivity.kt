package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Edit Text
        val editUser: EditText
        editUser = findViewById(R.id.edit_user)

        // Variavel de texto
        var userTexto: String

        // Button
        val buttonLogin: Button
        buttonLogin = findViewById(R.id.button_login)
        buttonLogin.setOnClickListener {
            userTexto = editUser.text.toString()
            Toast.makeText(this, userTexto + senha, Toast.LENGTH_LONG).show()
        }

    }

}
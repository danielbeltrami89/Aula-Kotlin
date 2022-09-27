package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editUser: EditText
        editUser = findViewById(R.id.edit_user)

        val editPass: EditText
        editPass = findViewById(R.id.edit_pass)

        var userTexto: String
        var passTexto: String

        val buttonLogin: Button
        buttonLogin = findViewById(R.id.button_login)
        buttonLogin.setOnClickListener {
            userTexto = editUser.text.toString()
            passTexto = editPass.text.toString()

            
        }

        val buttonCad: Button
        buttonCad = findViewById(R.id.button_cadastro)
        buttonCad.setOnClickListener {
            irParaCadastro()
        }

    }

    fun exibirToast(texto: String) {
        Toast.makeText(this, texto, Toast.LENGTH_LONG).show()
    }

    fun irParaCadastro() {
        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }

}
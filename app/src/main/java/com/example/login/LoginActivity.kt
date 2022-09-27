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

        val editEmail: EditText
        editEmail = findViewById(R.id.edit_user)

        val editPass: EditText
        editPass = findViewById(R.id.edit_pass)

        var emailTexto: String
        var passTexto: String

        val buttonLogin: Button
        buttonLogin = findViewById(R.id.button_login)
        buttonLogin.setOnClickListener {
            emailTexto = editEmail.text.toString()
            passTexto = editPass.text.toString()

            // e : &&
            // ou : ||
            if ((emailTexto == "x") && (passTexto == "2")) {
                // se for verdade
                Toast.makeText(this, "Login com sucesso").show()
            } else {
                // se for falso
                Toast.makeText(this, "Email ou senha incorretos").show()
            }
            
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
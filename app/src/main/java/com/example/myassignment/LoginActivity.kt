package com.example.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var email: String
        var password: String
        btnRegLogin.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)


        }
        btnLogin.setOnClickListener {
            email = txtEmail.text.toString()
            password = txtPassword.text.toString()
            validateUser(email, password)
        }
    }

    fun validateUser(email: String, password: String) {
        if (email == "joshuangomeli@gmail.com" && password == "ngomeli") {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

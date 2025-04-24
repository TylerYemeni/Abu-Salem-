// LoginActivity.kt
package com.abusalem.destroyer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private val correctPassword = "AbuSalemX2025"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val enteredPassword = passwordInput.text.toString()
            if (enteredPassword == correctPassword) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                passwordInput.error = "كلمة المرور غير صحيحة"
            }
        }
    }
}

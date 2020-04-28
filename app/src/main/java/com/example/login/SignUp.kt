package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val button: Button = findViewById(R.id.button_login);
       button.setOnClickListener {
           val intent = Intent(this, Login::class.java)
           startActivity(intent)
       }

    }
}

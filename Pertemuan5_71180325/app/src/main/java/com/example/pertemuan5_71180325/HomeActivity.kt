package com.example.pertemuan5_71180325

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import android.widget.TextView

class HomeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val email = intent.getStringExtra("email")

        val txtHome = findViewById<TextView>(R.id.txtHome)
        txtHome.text = "Selamat datang ${email}"
    }
}
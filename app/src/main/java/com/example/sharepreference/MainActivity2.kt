package com.example.sharepreference

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val localStorage=getSharedPreferences("user", Context.MODE_PRIVATE)

        val getName=localStorage.getString("username","name not found")
        val getEmail=localStorage.getString("useremail","email not found")

        val name=findViewById<TextView>(R.id.name)
        val email=findViewById<TextView>(R.id.email)

        name.text=getName
        email.text=getEmail




        Toast.makeText(this,"$getName", Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"$getEmail", Toast.LENGTH_SHORT).show()

    }
}
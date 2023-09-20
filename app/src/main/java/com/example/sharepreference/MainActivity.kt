package com.example.sharepreference

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name=findViewById<EditText>(R.id.Name)
        val Email=findViewById<EditText>(R.id.Email)

        val saveButton=findViewById<Button>(R.id.SaveButton)
        val ShowButton=findViewById<Button>(R.id.Showbutton)

        val localStorage=getSharedPreferences("user",Context.MODE_PRIVATE)


        saveButton.setOnClickListener{
            val editPref=localStorage.edit()
            editPref.putString("username",""+name.text.toString())
            editPref.putString("useremail",""+Email.text.toString()).apply()
        }

        ShowButton.setOnClickListener{
//    val getName=localStorage.getString("username","name not found")
//    val getEmail=localStorage.getString("useremail","email not found")
//    Toast.makeText(this,"$getName",Toast.LENGTH_SHORT).show()
//    Toast.makeText(this,"$getEmail",Toast.LENGTH_SHORT).show()
//
         val intent=Intent(this,MainActivity2::class.java)
         startActivity(intent)
}

    }
}
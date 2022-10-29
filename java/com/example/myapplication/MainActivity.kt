package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

//import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click=findViewById<Button>(R.id.bu1)
        click.setOnClickListener {
            Toast.makeText(this, "Going to next page", Toast.LENGTH_SHORT).show()
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }
}
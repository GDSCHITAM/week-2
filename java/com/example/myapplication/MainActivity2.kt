package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val click=findViewById<Button>(R.id.bu2)
        click.setOnClickListener {
            Toast.makeText(this, "Going to prev page", Toast.LENGTH_SHORT).show()
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        val url = "https:gdsc-hitam.github.io";
        startActivity(Intent(Intent.ACTION_VIEW).apply{
            data = Uri.parse(url)
        })
    }
}
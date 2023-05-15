package com.example.modul4intentex3kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.modul4intentex3kotlin.modul.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView();
    }

    private fun initView() {
        var b_open_second = findViewById<Button>(R.id.b_open_second)
        var user = User(20, "Jakhongir")
        b_open_second.setOnClickListener() {
            openSecondActivity(user)
        }
    }

    private fun openSecondActivity(user: User) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user", user)

        startActivity(intent)
    }
}
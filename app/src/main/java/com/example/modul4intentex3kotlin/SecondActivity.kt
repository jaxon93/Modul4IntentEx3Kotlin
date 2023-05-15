package com.example.modul4intentex3kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.modul4intentex3kotlin.modul.User

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    fun initView() {
        val tv_second = findViewById<TextView>(R.id.tv_second)
        val user: User? = intent.getParcelableExtra("user")
        tv_second.text = user.toString()
    }
}

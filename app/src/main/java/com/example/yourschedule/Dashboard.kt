package com.example.yourschedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yourschedule.R

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportActionBar?.hide()

    }
}
package com.example.yourschedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create)
        supportActionBar?.hide()

        val rollButton: Button = findViewById(R.id.create_button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Successfully added todo!", Toast.LENGTH_SHORT).show()
        }
    }
}
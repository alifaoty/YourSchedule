package com.example.yourschedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Read : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.read)
        supportActionBar?.hide()

        val ScheduleList = listOf<Schedule>(
            Schedule(
                "Homework"
            ),
            Schedule(
                "Studying"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_todo)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ScheduleAdapter(this, ScheduleList) {
        }
    }
}
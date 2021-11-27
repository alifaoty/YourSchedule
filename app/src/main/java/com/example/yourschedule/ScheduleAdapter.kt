package com.example.yourschedule

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ScheduleAdapter (private val context: Context, private val todo: List<Schedule>, val listener: (Schedule) -> Unit)
    : RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>() {

    class ScheduleViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val sche = view.findViewById<TextView>(R.id.Checkbox)

        fun bindView(schedule:  Schedule, listener: (Schedule) -> Unit) {
            sche.text = (schedule.sche)
            itemView.setOnClickListener{
                (listener(schedule))
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        return ScheduleViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        )
    }
    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.bindView(schedule[position], listener)
    }

    override fun getItemCount(): Int = todo.size
}
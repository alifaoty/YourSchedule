package com.example.yourschedule

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Schedule(
    val sche: String
): Parcelable
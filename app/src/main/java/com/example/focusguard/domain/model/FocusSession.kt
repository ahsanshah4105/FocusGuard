package com.example.focusguard.domain.model

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable

@SuppressLint("ParcelCreator")
data class FocusSession(
    val id: String,
    val title: String,
    val durationMinutes: Int,
    val category: String,
    val notes: String,
    val completedAt: Long,
    val isSynced: Boolean) : Parcelable {
    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        TODO("Not yet implemented")
    }
}
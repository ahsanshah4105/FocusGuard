package com.example.focusguard.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class FocusTimerService: Service() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(
        intent: Intent?,
        flags: Int,
        startId: Int
    ): Int {
        when(intent?.action){
            ACTION_START -> {

            }

            ACTION_STOP -> {

            }
        }

        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    companion object {
        const val ACTION_START = "com.example.focusguard.ACTION_START"
        const val ACTION_STOP = "com.example.focusguard.ACTION_STOP"
    }
}
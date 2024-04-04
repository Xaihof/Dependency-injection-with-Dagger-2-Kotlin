package com.example.dependencyinjectionwithdagger2

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to: String, from: String, body: String) {
        Log.d("XAIHOF", "Email Sent")
    }

}
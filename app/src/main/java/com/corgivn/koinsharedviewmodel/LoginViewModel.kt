package com.corgivn.koinsharedviewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    fun doSomething() {
        Log.e(TAG, "doSomething")
    }

    companion object {
        const val TAG = "LoginViewModel#TAG"
    }
}
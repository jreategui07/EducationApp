package com.example.project_g04.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesManager(context: Context, name: String) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()

    fun putString(key: String, value: String) {
        editor.putString(key, value)
        editor.apply()
    }

    fun getString(key: String, defaultValue: String): String {
        return sharedPreferences.getString(key, defaultValue) ?: ""
    }

    fun clear() {
        editor.clear()
        editor.apply()
    }
}

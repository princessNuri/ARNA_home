package com.example.arnahome.data.local.pref

import android.annotation.SuppressLint
import android.content.SharedPreferences

fun SharedPreferences.put(key: String, value: Any) =
    edit().apply {
        when (value) {
            is String -> putString(key, value)
            is Int -> putInt(key, value)
            is Long -> putLong(key, value)
            is Float -> putFloat(key, value)
            is Boolean -> putBoolean(key, value)
        }
    }.apply()

@SuppressLint("ApplySharedPref")
fun SharedPreferences.writeSync(key: String, value: Any) =
    this.edit()?.apply {
        when (value) {
            is String -> putString(key, value)
            is Int -> putInt(key, value)
            is Long -> putLong(key, value)
            is Float -> putFloat(key, value)
            is Boolean -> putBoolean(key, value)
        }
        commit()
    }

fun SharedPreferences.clear() = this.edit().clear().apply()

fun SharedPreferences.remove(key: String) = this.edit().remove(key).apply()
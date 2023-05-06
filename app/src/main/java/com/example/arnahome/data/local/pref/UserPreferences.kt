package com.example.arnahome.data.local.pref

import android.content.SharedPreferences
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import javax.inject.Inject

class UserPreferences @Inject constructor(
    private val sharedPreferences: SharedPreferences
) {
    var isAuthenticated: Boolean
        get() = sharedPreferences.getBoolean(PreferencesKeys.IS_AUTHENTICATED, false)
        set(value) = sharedPreferences.put(PreferencesKeys.IS_AUTHENTICATED, value)

    var accessToken: String?
        get() = sharedPreferences.getString(PreferencesKeys.ACCESS_TOKEN, "")
        set(value) = sharedPreferences.put(PreferencesKeys.ACCESS_TOKEN, value.toString())

    var refreshToken: String?
        get() = sharedPreferences.getString(PreferencesKeys.REFRESH_TOKEN, "")
        set(value) = sharedPreferences.put(PreferencesKeys.REFRESH_TOKEN, value.toString())

    var userID: String?
        get() = sharedPreferences.getString(PreferencesKeys.USER_ID, "")
        set(value) = sharedPreferences.put(PreferencesKeys.USER_ID, value.toString())

    var username: String?
        get() = sharedPreferences.getString(PreferencesKeys.USERNAME, "")
        set(value) = sharedPreferences.put(PreferencesKeys.USERNAME, value.toString())

    var password: String?
        get() = sharedPreferences.getString(PreferencesKeys.PASSWORD, "")
        set(value) = sharedPreferences.put(PreferencesKeys.PASSWORD, value.toString())

    var userEmail: String?
        get() = sharedPreferences.getString(PreferencesKeys.USER_EMAIL, "")
        set(value) = sharedPreferences.put(PreferencesKeys.USER_EMAIL, value.toString())

    fun clearPreferences() = sharedPreferences.clear()

    private val _authenticationState = MutableSharedFlow<Boolean>()
    val authenticationState: SharedFlow<Boolean> = _authenticationState
}
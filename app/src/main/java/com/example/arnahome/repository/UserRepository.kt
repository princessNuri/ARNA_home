package com.example.arnahome.repository

import android.util.Log
import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.local.pref.UserPreferences
import com.example.arnahome.data.remote.apiService.user.UserApiService
import com.example.arnahome.data.remote.dto.ChangeUsernameOrEmailDto
import com.example.arnahome.data.remote.dto.changePassword.changePasswordDto
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userApiService: UserApiService,
    private val userPreferences: UserPreferences
) : BaseRepository() {

    fun getUserProfile(id: Int = userPreferences.userID.toString().toInt()) = makeNetworkRequest {
        userApiService.getUserProfile(id)
    }

    fun deleteAccount() = makeNetworkRequest {
        userApiService.deleteAccount(
            userPreferences.userID.toString().toInt()
        )
    }

    fun getFavoriteTours() = makeNetworkRequest {
        userApiService.fetchFavorites(userPreferences.userID.toString().toInt()).favoriteTour
    }

    fun changePassword(
        email: String,
        passwordOld: String,
        passwordNew: String,
        passwordNewAgain: String
    ) = makeNetworkRequest {
        Log.e(
            "ок", userPreferences.userID.toString()
        )
        userApiService.changePassword(
            userPreferences.userID.toString().toInt(),
            changePasswordDto(
                email,
                passwordOld,
                passwordNew,
                passwordNewAgain
            )
        )
    }

    fun changeUsernameOrPassword(username: String, email: String) = makeNetworkRequest {
        userApiService.changeUsernameOrEmail(ChangeUsernameOrEmailDto(username, email))
    }
}
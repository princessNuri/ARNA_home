package com.example.arnahome.repository

import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.remote.apiService.auth.AuthenticationApiService
import com.example.arnahome.data.remote.dto.SignInDto
import com.example.arnahome.data.remote.dto.SignInWithGoogleDto
import com.example.arnahome.data.remote.dto.SignUpDto
import javax.inject.Inject

class AuthenticationRepository @Inject constructor(
    private val authenticationApiService: AuthenticationApiService
) : BaseRepository() {

    fun signUp(
        username: String,
        email: String,
        password: String,
        password_again: String
    ) = makeNetworkRequest {
        authenticationApiService.signUp(
            SignUpDto(
                username,
                email,
                password,
                password_again
            )
        )
    }

    fun signIn(username: String, password: String) = makeNetworkRequest {
        authenticationApiService.login(SignInDto(username, password))
    }

    fun signInWIthGoogle(idToken: String) = makeNetworkRequest {
        authenticationApiService.signInWithGoogle(SignInWithGoogleDto(idToken))
    }
}
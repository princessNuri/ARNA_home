package com.example.arnahome.ui.auth.signIn

import com.example.arnahome.core.base.BaseViewModel
import com.example.arnahome.data.remote.dto.SignInDto
import com.example.arnahome.repository.AuthenticationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(private val repository: AuthenticationRepository) : BaseViewModel() {
    fun getSignIn( signInDto: SignInDto) {
        repository.signIn(signInDto)
    }
}
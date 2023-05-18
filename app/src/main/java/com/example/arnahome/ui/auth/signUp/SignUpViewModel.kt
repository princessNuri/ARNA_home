package com.example.arnahome.ui.auth.signUp

import androidx.lifecycle.ViewModel
import com.example.arnahome.core.base.BaseViewModel
import com.example.arnahome.data.remote.dto.SignUpDto
import com.example.arnahome.repository.AuthenticationRepository

class SignUpViewModel(private val repository: AuthenticationRepository) : BaseViewModel() {
    fun getSignUp( signUpDto: SignUpDto) {
        repository.signUp(signUpDto)
    }
}
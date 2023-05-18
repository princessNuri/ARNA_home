package com.example.arnahome.data.remote.apiService.auth

import com.example.arnahome.data.remote.dto.SignInDto
import com.example.arnahome.data.remote.dto.SignInResultDto
import com.example.arnahome.data.remote.dto.SignUpDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApiService {

    @POST("/api/v1/public/auth/register")
    suspend fun signUp(@Body signUpDto: SignUpDto)

    @POST("/api/v1/public/auth/login")
    suspend fun login(@Body signInDto: SignInDto): SignInResultDto

}
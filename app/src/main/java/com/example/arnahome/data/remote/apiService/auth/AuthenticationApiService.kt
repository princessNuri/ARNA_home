package com.example.arnahome.data.remote.apiService.auth

import com.example.arnahome.data.remote.dto.SignInDto
import com.example.arnahome.data.remote.dto.SignInResultDto
import com.example.arnahome.data.remote.dto.SignInWithGoogleDto
import com.example.arnahome.data.remote.dto.SignUpDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApiService {

    @POST("users/register/")
    suspend fun signUp(@Body signUpDto: SignUpDto)

    @POST("users/login/")
    suspend fun login(@Body signInDto: SignInDto): SignInResultDto

    @POST("users/google/")
    suspend fun signInWithGoogle(@Body signInWithGoogleDto: SignInWithGoogleDto): SignInResultDto
}
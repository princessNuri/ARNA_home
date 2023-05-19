package com.example.arnahome.data.remote.apiService.auth

import com.example.arnahome.data.remote.dto.RefreshTokenDto
import com.example.arnahome.data.remote.dto.TokensDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RefreshAccessTokenApiService {

    @POST("/api/v1/protected/token/refresh")
    fun refreshTokens(@Body refreshToken: RefreshTokenDto): Call<TokensDto>
}
package com.example.arnahome.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RefreshTokenDto(
    @SerializedName("refresh")
    val refresh: String
)
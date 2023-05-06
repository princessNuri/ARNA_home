package com.example.arnahome.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TokensDto(
    @SerializedName("refresh")
    val refresh: String,
    @SerializedName("access")
    val access: String
)
package com.example.arnahome.data.remote.dto

import com.google.gson.annotations.SerializedName

data class SignUpDto(
    @SerializedName("username")
    val username: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("password_again")
    val password_again: String
)
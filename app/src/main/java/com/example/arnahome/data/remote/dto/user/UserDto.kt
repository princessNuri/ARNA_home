package com.example.arnahome.data.remote.dto.user


import com.example.arnahome.data.remote.dto.favourites.FavoriteTourDto
import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("username")
    val username: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("favorite_tour")
    val favoriteTour: List<FavoriteTourDto>
)
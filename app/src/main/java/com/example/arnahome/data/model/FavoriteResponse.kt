package com.example.arnahome.data.model

import com.google.gson.annotations.SerializedName

data class FavoriteResponse(
    @SerializedName("favorite_tour")
    val favorite_tour: List<FavoriteModel>,
)

data class FavoriteModel(
    @SerializedName("slug")
    val slug: String,
)
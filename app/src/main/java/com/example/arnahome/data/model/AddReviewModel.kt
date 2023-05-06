package com.example.arnahome.data.model

import com.google.gson.annotations.SerializedName

data class AddReviewModel(
    @SerializedName("text")
    val text: String,
    @SerializedName("post")
    val post: Int,
    @SerializedName("rating")
    val rating: Int,
)

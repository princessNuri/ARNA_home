package com.example.arnahome.data.model

data class SlugResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<SlugModel>
)

data class SlugModel(
    val slug: String,
    val title: String,
    val region: List<Region>
)
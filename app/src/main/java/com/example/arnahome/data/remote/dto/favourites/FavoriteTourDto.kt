package com.example.arnahome.data.remote.dto.favourites


import com.example.arnahome.data.model.CategoryModel
import com.example.arnahome.data.model.Guide
import com.example.arnahome.data.model.Region
import com.example.arnahome.data.model.TourImage
import com.google.gson.annotations.SerializedName

data class FavoriteTourDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("price")
    val price: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("date_published")
    val datePublished: String,
    @SerializedName("date_departure")
    val dateDeparture: String?,
    @SerializedName("date_arrival")
    val dateArrival: String,
    @SerializedName("quantity_limit")
    val quantityLimit: Int,
    @SerializedName("actual_limit")
    val actualLimit: Any?,
    @SerializedName("is_hot")
    val isHot: Boolean,
    @SerializedName("duration")
    val duration: String,
    @SerializedName("complexity")
    val complexity: String,
    @SerializedName("category")
    val category: CategoryModel,
    @SerializedName("guide")
    val guide: Guide,
    @SerializedName("region")
    val region: List<Region>,
    @SerializedName("tour_images")
    val tour_images: List<TourImage>
) : java.io.Serializable
package com.example.arnahome.data.model

import com.example.arnahome.core.network.paging.DataMapper
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ToursResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<TourModel>,
) : DataMapper<TourModel> {
    override fun responseToModel(): List<TourModel> = this.results
}

class TourModelBySlug : ArrayList<TourModel>()

data class TourModel(
    val id: Int,
    val title: String,
    val description: String,
    val price: Int,
    val date_published: String,
    val date_departure: String?,
    val date_arrival: String,
    val average_rating: String,
    val quantity_limit: Int,
    val set_actual_limit: Int,
    val is_hot: Boolean,
    val duration: String,
    val slug: String,
    val complexity: String,
    val category: CategoryModel,
    val guide: Guide,
    val region: List<Region>,
    val tour_images: List<TourImage>,
    @SerializedName("qr_code")
    val qr_code : String
) : Serializable

data class Region(
    val id: Int,
    val name: String,
) : Serializable

data class Guide(
    val get_initials: String,
    val id: Int,
    var photo: String = "test",
) : Serializable

data class TourImage(
    val images: String = "",
    val is_main: Boolean,
) : Serializable

data class CategoryModel(
    val id: Int,
    val name: String,
) : Serializable
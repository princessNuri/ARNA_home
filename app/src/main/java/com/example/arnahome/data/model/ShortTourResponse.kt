package com.example.arnahome.data.model

import com.example.arnahome.core.network.paging.DataMapper
import com.example.arnahome.core.network.paging.IBaseDiffModel


data class ShortTourResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<ShortTourModel>,
) : DataMapper<ShortTourModel> {
    override fun responseToModel(): List<ShortTourModel> = this.results
}

data class ShortTourModel(
    val average_rating: String,
    val duration: String,
    val id: Int,
    val price: Int,
    val region: List<Region>,
    val slug: String,
    val title: String,
    val tour_images: List<TourImage>,
    val is_hot: Boolean
) : IBaseDiffModel<Long> {
    override val idDif: Long
        get() = this.id.toLong()
}


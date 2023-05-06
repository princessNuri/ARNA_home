package com.example.arnahome.data.remote.apiService.tours

import com.example.arnahome.data.model.FavoriteResponse
import com.example.arnahome.data.model.ShortTourResponse
import com.example.arnahome.data.model.SlugResponse
import com.example.arnahome.data.model.TourModel
import retrofit2.Response
import retrofit2.http.*

interface ToursApiService {

    @GET("home/slugs")
    suspend fun getSlugs(
        @Query("limit") limit: Int = 39,
    ): Response<SlugResponse>

    @GET("home/tour/{slug}")
    suspend fun getTourBySlug(
        @Path("slug") slug: String,
    ): Response<TourModel>

    @GET("home/tours/")
    suspend fun getTours(
        @Query("offset") offset: Int = 0,
        @Query("limit") limit: Int,
    ): Response<ShortTourResponse>

    @GET("home/tours/{slug}/favorite/")
    suspend fun getFavorites(@Path("slug") slug: String): Response<FavoriteResponse>
}
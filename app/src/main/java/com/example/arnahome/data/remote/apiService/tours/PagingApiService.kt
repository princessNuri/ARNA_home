package com.example.arnahome.data.remote.apiService.tours

import com.example.arnahome.data.model.ReviewResponse
import com.example.arnahome.data.model.ShortTourResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PagingApiService {

    @GET("home/tours/")
    suspend fun getFilteredTours(
        @Query("offset") offset: Int = 0,
        @Query("limit") limit: Int = 1,
        @Query("category") category: String,
        @Query("date_departure") date_departure: String,
        @Query("complexity") complexity: String,
        @Query("duration") duration: String,
        @Query("price_max") price_max: String,
    ): Response<ShortTourResponse>

    @GET("home/tours/{slug}/reviews")
    suspend fun getReviewsBySlug(
        @Path("slug") slug: String,
        @Query("offset") offset: Int,
        @Query("limit") limit: Int = 1,
    ): Response<ReviewResponse>
}
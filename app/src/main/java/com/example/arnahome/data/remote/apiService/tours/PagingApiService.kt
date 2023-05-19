package com.example.arnahome.data.remote.apiService.tours

import com.example.arnahome.data.model.ReviewResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PagingApiService {

    @GET("home/tours/{slug}/reviews")
    suspend fun getReviewsBySlug(
        @Path("slug") slug: String,
        @Query("offset") offset: Int,
        @Query("limit") limit: Int = 1,
    ): Response<ReviewResponse>
}
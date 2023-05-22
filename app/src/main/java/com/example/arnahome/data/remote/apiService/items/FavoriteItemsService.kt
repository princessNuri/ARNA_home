package com.example.arnahome.data.remote.apiService.items

import com.example.arnahome.data.model.ProductResponse
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface FavoriteItemsService {

    @GET("api/v1/protected/items/favorites")
    suspend fun getFavoriteItems(@Header("Authorization") authHeader: String?): Response<ProductResponse>

    @DELETE("/api/v1/protected/items/{item-id}/favorites")
    suspend fun deleteFavoriteItem(@Path("item-id") itemId: Int, @Header("Authorization") authHeader: String?): Response<Unit>

    @POST("api/v1/protected/items/{item-id}/favorites")
    suspend fun addFavoriteItem(@Path("item-id") itemId: Int, @Header("Authorization") authHeader: String?): Response<Unit>

}
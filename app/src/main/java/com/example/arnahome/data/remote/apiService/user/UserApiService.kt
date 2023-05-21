package com.example.arnahome.data.remote.apiService.user

import com.example.arnahome.data.remote.dto.ChangeUsernameOrEmailDto
import com.example.arnahome.data.remote.dto.changePassword.changePasswordDto
import retrofit2.Response
import retrofit2.http.*

interface UserApiService {

    @DELETE("profiles/profile/{id}/")
    suspend fun deleteAccount(@Path("id") id: Int)

//    @POST("home/review/")
//    suspend fun addReview(@Body addReviewModel: AddReviewModel): Response<Unit>

    @PATCH("profiles/change-password/{id}/")
    suspend fun changePassword(@Path("id") id: Int, @Body changePasswordDto: changePasswordDto)

    @PUT("profiles/profile/{id}/")
    suspend fun changeUsernameOrEmail(@Body changeUsernameOrEmailDto: ChangeUsernameOrEmailDto)

    @POST("home/tours/{slug}/favorite/")
    suspend fun addFavorite(@Path("slug") slug: String): Response<Unit>

    @DELETE("home/tours/{slug}/favorite/")
    suspend fun deleteFavorite(@Path("slug") slug: String): Response<Unit>
}
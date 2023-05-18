package com.example.arnahome.data.remote.remoteDataSource

import com.example.arnahome.core.network.baseDataSource.BaseDataSource
import com.example.arnahome.data.model.AddReviewModel
import com.example.arnahome.data.remote.apiService.user.UserApiService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val userApiService: UserApiService,
) : BaseDataSource() {

    suspend fun addReview(review: AddReviewModel) = getResult { userApiService.addReview(review) }

    suspend fun addFavorite(slug: String) = getResult { userApiService.addFavorite(slug) }

    suspend fun deleteFavorite(slug: String) = getResult { userApiService.deleteFavorite(slug) }

}
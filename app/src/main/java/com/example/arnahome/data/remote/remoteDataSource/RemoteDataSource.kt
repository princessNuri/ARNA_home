package com.example.arnahome.data.remote.remoteDataSource

import com.example.arnahome.core.network.baseDataSource.BaseDataSource
import com.example.arnahome.data.remote.apiService.items.FavoriteItemsService
import com.example.arnahome.data.remote.apiService.user.UserApiService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val userApiService: UserApiService,
    private val favoriteItemsService: FavoriteItemsService
) : BaseDataSource() {

    //suspend fun addReview(review: AddReviewModel) = getResult { userApiService.addReview(review) }

    suspend fun addFavorite(slug: String) = getResult { userApiService.addFavorite(slug) }

    suspend fun deleteFavorite(slug: String) = getResult { userApiService.deleteFavorite(slug) }

    suspend fun getFavoriteItems(accessToken: String?) = getResult {favoriteItemsService.getFavoriteItems(accessToken)}

    suspend fun addFavoriteItem(accessToken: String?, itemId: Int) = getResult {favoriteItemsService.addFavoriteItem(itemId, accessToken)}

    suspend fun removeFavoriteItem(accessToken: String?, itemId: Int) = getResult { favoriteItemsService.deleteFavoriteItem(itemId, accessToken) }

}
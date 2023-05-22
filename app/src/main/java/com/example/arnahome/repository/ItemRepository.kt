package com.example.arnahome.repository

import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.local.pref.UserPreferences
import com.example.arnahome.data.remote.remoteDataSource.RemoteDataSource
import javax.inject.Inject

class ItemRepository @Inject constructor(
    private val dataSource: RemoteDataSource,
    private val userPreferences: UserPreferences
) : BaseRepository() {

    fun getFavoriteItems() = doRequest { dataSource.getFavoriteItems(userPreferences.accessToken) }

    fun addFavoriteItem(itemId: Int) = doRequest { dataSource.addFavoriteItem(userPreferences.accessToken, itemId) }

    fun removeFavoriteItem(itemId: Int) = doRequest { dataSource.removeFavoriteItem(userPreferences.accessToken, itemId) }
}
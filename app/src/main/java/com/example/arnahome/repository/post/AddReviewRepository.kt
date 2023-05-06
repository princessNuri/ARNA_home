package com.example.arnahome.repository.post

import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.model.AddReviewModel
import com.example.arnahome.data.remote.remoteDataSource.RemoteDataSource
import javax.inject.Inject

class
AddReviewRepository @Inject constructor(
    private val dataSource: RemoteDataSource,
) : BaseRepository() {

    fun addReview(review: AddReviewModel) = doRequest { dataSource.addReview(review) }
}
package com.example.arnahome.repository.tours

import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.remote.apiService.tours.PagingApiService
import com.example.arnahome.data.remote.pagingSources.ReviewPagingSource
import com.example.arnahome.data.remote.remoteDataSource.RemoteDataSource
import javax.inject.Inject

class DetailTourRepository @Inject constructor(
    private val dataSource: RemoteDataSource,
    private val apiService: PagingApiService,
) : BaseRepository() {


    fun getReviewsBySlug(slug: String) =
        doPagingRequest(ReviewPagingSource(apiService, slug = slug), pageSize = 10)

    fun addFavorite(slug: String) = doRequest { dataSource.addFavorite(slug) }

    fun deleteFavorite(slug: String) = doRequest { dataSource.deleteFavorite(slug) }

}
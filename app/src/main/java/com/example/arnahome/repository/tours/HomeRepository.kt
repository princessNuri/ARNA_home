package com.example.arnahome.repository.tours

import androidx.paging.PagingData
import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.model.FilterModel
import com.example.arnahome.data.model.ShortTourModel
import com.example.arnahome.data.remote.apiService.tours.PagingApiService
import com.example.arnahome.data.remote.pagingSources.ToursPagingSource
import com.example.arnahome.data.remote.remoteDataSource.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val dataSource: RemoteDataSource,
    private val apiService: PagingApiService,
) : BaseRepository() {

    fun getTours(limit: Int) =
        doRequest { dataSource.getTours(limit = limit) }

    fun getCategoryTours(category: String): Flow<PagingData<ShortTourModel>> {
        return doPagingRequest(ToursPagingSource(apiService, FilterModel(category)), pageSize = 10)
    }
}
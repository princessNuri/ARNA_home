package com.example.arnahome.repository.tours

import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.remote.apiService.tours.PagingApiService
import com.example.arnahome.data.remote.remoteDataSource.RemoteDataSource
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val dataSource: RemoteDataSource,
    private val apiService: PagingApiService,
) : BaseRepository() {

//    fun getTours(limit: Int) =
//        doRequest { dataSource.getTours(limit = limit) }
//
//    fun getCategoryTours(category: String): Flow<PagingData<ShortTourModel>> {
//        return doPagingRequest(ToursPagingSource(apiService, FilterModel(category)), pageSize = 10)
//    }
}
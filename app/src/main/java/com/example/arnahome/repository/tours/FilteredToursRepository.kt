package com.example.arnahome.repository.tours

import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.remote.apiService.tours.PagingApiService
import javax.inject.Inject

class FilteredToursRepository @Inject constructor(private val apiService: PagingApiService) :
    BaseRepository() {

//    fun getFilteredTours(filter: FilterModel): Flow<PagingData<ShortTourModel>> {
//        return doPagingRequest(ToursPagingSource(apiService, filter), pageSize = 10)
//    }
}
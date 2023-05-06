package com.example.arnahome.data.remote.pagingSources

import com.example.arnahome.core.network.paging.BasePagingSource
import com.example.arnahome.data.model.FilterModel
import com.example.arnahome.data.model.ShortTourModel
import com.example.arnahome.data.model.ShortTourResponse
import com.example.arnahome.data.remote.apiService.tours.PagingApiService

class ToursPagingSource(private val apiService: PagingApiService, filter: FilterModel) :
    BasePagingSource<ShortTourResponse, ShortTourModel>({
        apiService.getFilteredTours(
            it,
            category = filter.category,
            date_departure = filter.date_departure,
            complexity = filter.complexity,
            duration = filter.duration,
            price_max = filter.price_max,
        )
    })
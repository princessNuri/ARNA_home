package com.example.arnahome.data.remote.pagingSources

import com.example.arnahome.core.network.paging.BasePagingSource
import com.example.arnahome.data.model.ReviewModel
import com.example.arnahome.data.model.ReviewResponse
import com.example.arnahome.data.remote.apiService.tours.PagingApiService

class ReviewPagingSource(private val apiService: PagingApiService, slug: String) :
    BasePagingSource<ReviewResponse, ReviewModel>({
        apiService.getReviewsBySlug(
            slug = slug,
            it,
        )
    })
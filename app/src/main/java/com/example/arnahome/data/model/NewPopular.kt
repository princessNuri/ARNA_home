package com.example.arnahome.data.model

data class NewPopular(
    var content: List<Content?>?,
    var empty: Boolean?,
    var first: Boolean?,
    var last: Boolean?,
    var number: Int?,
    var numberOfElements: Int?,
    var pageable: Pageable?,
    var size: Int?,
    var sort: Sort?,
    var totalElements: Int?,
    var totalPages: Int?
) {
    data class Content(
        var id: Int?,
        var imageUrl: String?,
        var liked: Boolean?,
        var name: String?,
        var price: Double?,
        var rating: Double?
    )

    data class Pageable(
        var offset: Int?,
        var pageNumber: Int?,
        var pageSize: Int?,
        var paged: Boolean?,
        var sort: Sort?,
        var unpaged: Boolean?
    ) {
        data class Sort(
            var empty: Boolean?,
            var sorted: Boolean?,
            var unsorted: Boolean?
        )
    }

    data class Sort(
        var empty: Boolean?,
        var sorted: Boolean?,
        var unsorted: Boolean?
    )
}
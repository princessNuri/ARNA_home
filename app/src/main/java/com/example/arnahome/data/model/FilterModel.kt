package com.example.arnahome.data.model

data class FilterModel(
    var category: String = "",
    var date_departure: String = "",
    var complexity: String = "",
    var duration: String = "",
    var price_max: String = "",
) : java.io.Serializable
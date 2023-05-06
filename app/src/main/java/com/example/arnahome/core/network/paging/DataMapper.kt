package com.example.arnahome.core.network.paging

interface DataMapper<T> {
    fun responseToModel(): List<T>
}
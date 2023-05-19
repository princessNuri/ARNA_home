package com.example.arnahome.repository.tours

import com.example.arnahome.data.base.BaseRepository
import com.example.arnahome.data.remote.remoteDataSource.RemoteDataSource
import javax.inject.Inject

class SearchRepository @Inject constructor(private val dataSource: RemoteDataSource) :
    BaseRepository() {

    //fun getSlugs() = doRequest { dataSource.getSlugs() }
}
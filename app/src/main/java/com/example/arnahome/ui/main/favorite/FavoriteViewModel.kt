package com.example.arnahome.ui.main.favorite

import com.example.arnahome.core.base.BaseViewModel
import com.example.arnahome.repository.ItemRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val itemRepository: ItemRepository,
) : BaseViewModel() {

}
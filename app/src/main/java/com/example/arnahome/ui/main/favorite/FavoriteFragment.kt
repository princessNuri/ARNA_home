package com.example.arnahome.ui.main.favorite

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentFavoriteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoriteFragment :  BaseFragment<FragmentFavoriteBinding, FavoriteViewModel>(R.layout.fragment_favorite) {

    override val binding by viewBinding(FragmentFavoriteBinding::bind)
    override val viewModel by viewModels<FavoriteViewModel>()



}
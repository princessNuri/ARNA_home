package com.example.arnahome.ui.main.home

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.data.model.ProductResponse
import com.example.arnahome.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {

     val products = arrayListOf<ProductResponse.Content>()


    override val binding by viewBinding(FragmentHomeBinding::bind)
    override val viewModel by viewModels<HomeViewModel>()
//  private val walkingAdapter by lazy { HomeAdapter(products) }\I    QA\





}
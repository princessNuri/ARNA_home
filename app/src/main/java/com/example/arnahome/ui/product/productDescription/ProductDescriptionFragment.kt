package com.example.arnahome.ui.product.productDescription

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentProductDescriptionBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductDescriptionFragment : BaseFragment<
        FragmentProductDescriptionBinding, ProductDescriptionViewModel>(R.layout.fragment_product_description) {

    override val binding by viewBinding(FragmentProductDescriptionBinding::bind)
    override val viewModel by viewModels<ProductDescriptionViewModel>()



}
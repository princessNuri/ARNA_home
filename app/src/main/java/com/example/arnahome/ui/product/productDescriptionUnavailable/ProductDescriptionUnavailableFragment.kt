package com.example.arnahome.ui.product.productDescriptionUnavailable

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentProductDescriptionUnavailableBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductDescriptionUnavailableFragment : BaseFragment<
        FragmentProductDescriptionUnavailableBinding, ProductDescriptionUnavailableViewModel>(R.layout.fragment_product_description_unavailable) {

    override val binding by viewBinding(FragmentProductDescriptionUnavailableBinding::bind)
    override val viewModel by viewModels<ProductDescriptionUnavailableViewModel>()


}
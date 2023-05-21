package com.example.arnahome.ui.product.checkout

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentCheckoutBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CheckoutFragment : BaseFragment<FragmentCheckoutBinding, CheckoutViewModel>(R.layout.fragment_checkout) {

    override val binding by viewBinding(FragmentCheckoutBinding::bind)
    override val viewModel by viewModels<CheckoutViewModel>()



}
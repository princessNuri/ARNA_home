package com.example.arnahome.ui.main.cart

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentCartBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CartFragment : BaseFragment<FragmentCartBinding, CartViewModel>(R.layout.fragment_cart) {

    override val binding by viewBinding(FragmentCartBinding::bind)
    override val viewModel by viewModels<CartViewModel>()


}
package com.example.arnahome.ui.product.delivery

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentDeliveryBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DeliveryFragment : BaseFragment<FragmentDeliveryBinding, DeliveryViewModel>(R.layout.fragment_delivery) {

    override val binding by viewBinding(FragmentDeliveryBinding::bind)
    override val viewModel by viewModels<DeliveryViewModel>()



}
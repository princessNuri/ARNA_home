package com.example.arnahome.ui.product.payment

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentPaymentMethodBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PaymentMethodFragment : BaseFragment<FragmentPaymentMethodBinding, PaymentMethodViewModel>(R.layout.fragment_payment_method) {

    override val binding by viewBinding(FragmentPaymentMethodBinding::bind)
    override val viewModel by viewModels<PaymentMethodViewModel>()



}
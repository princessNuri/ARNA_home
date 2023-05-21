package com.example.arnahome.ui.order

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentOrderBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OrderFragment(
    override val binding: FragmentOrderBinding,
    override val viewModel: OrderViewModel
) : BaseFragment<FragmentOrderBinding,OrderViewModel>(R.layout.fragment_order) {

}
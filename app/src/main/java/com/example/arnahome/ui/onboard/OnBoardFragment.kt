package com.example.arnahome.ui.onboard

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentOnBoardBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class OnBoardFragment : BaseFragment<FragmentOnBoardBinding, OnBoardViewModel>(R.layout.fragment_on_board) {

    override val binding by viewBinding(FragmentOnBoardBinding::bind)
    override val viewModel by viewModels<OnBoardViewModel>()

}
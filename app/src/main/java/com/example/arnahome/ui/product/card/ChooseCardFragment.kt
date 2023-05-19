package com.example.arnahome.ui.product.card

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentChooseCardBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChooseCardFragment : BaseFragment<FragmentChooseCardBinding, ChooseCardViewModel>(R.layout.fragment_choose_card) {

    override val binding by viewBinding(FragmentChooseCardBinding::bind)
    override val viewModel by viewModels<ChooseCardViewModel>()


}
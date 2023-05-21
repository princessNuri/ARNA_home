package com.example.arnahome.ui.review

import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentReviewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReviewFragment(
    override val binding: FragmentReviewBinding,
    override val viewModel: ReviewViewModel
) : BaseFragment<FragmentReviewBinding, ReviewViewModel>(R.layout.fragment_review) {

}
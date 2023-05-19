package com.example.arnahome.ui.main.notifications

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentNotificationsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationsFragment : BaseFragment<FragmentNotificationsBinding, NotificationsViewModel>(R.layout.fragment_notifications) {

    override val binding by viewBinding(FragmentNotificationsBinding::bind)
    override val viewModel by viewModels<NotificationsViewModel>()

}
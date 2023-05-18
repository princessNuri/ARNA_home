package com.example.arnahome.ui.auth.signIn

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.data.remote.dto.SignInDto
import com.example.arnahome.databinding.FragmentSignInBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment : BaseFragment<FragmentSignInBinding, SignInViewModel>(R.layout.fragment_sign_in) {

    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel by viewModels<SignInViewModel>()

    override fun initRequest() {
        binding.apply {
            btnSignIn.setOnClickListener {
                viewModel.getSignIn(
                    SignInDto(
                        username = etUsername.text.toString(),
                        password = etPassword.text.toString()
                ))
            }

        }
    }
}
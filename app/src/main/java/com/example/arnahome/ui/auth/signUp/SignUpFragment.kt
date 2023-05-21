package com.example.arnahome.ui.auth.signUp

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.arnahome.R
import com.example.arnahome.core.base.BaseFragment
import com.example.arnahome.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment: BaseFragment<FragmentSignUpBinding, SignUpViewModel>(R.layout.fragment_sign_up) {

    override val binding by viewBinding(FragmentSignUpBinding::bind)
    override val viewModel by viewModels<SignUpViewModel>()

    override fun initRequest() {
        binding.apply {
            btnSignUp.setOnClickListener {
//            viewModel.getSignUp(
//                SignUpDto(
//                    username =username.text.toString(),
//                    email = email.text.toString(),
//                    password = password.text.toString(),
//                    password_again = passwordAgain.text.toString()
//                )
//            )
            }
        }

    }
}
package com.suiunbek.presentation.ui.fragments.singup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.suiunbek.presentation.R
import com.suiunbek.presentation.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private val binding by viewBinding(FragmentSignUpBinding::bind)
    private val viewModel: SignUpViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() = with(binding) {
        getUserDataBottom.setOnClickListener {
            viewModel.saveUser(
                com.suiunbek.domain.models.user.UserModel(
                    userAge = age.text.toString().trim(),
                    userName = name.text.toString().trim(),
                    userEmail = email.text.toString().trim(),
                    userPassword = password.text.toString().trim()
                )
            )
            findNavController().navigate(
                R.id.action_signUpFragment_to_userDataFragment
            )
        }
    }
}
package com.suiunbek.presentation.ui.fragments.singup

import androidx.lifecycle.ViewModel
import com.suiunbek.domain.models.user.UserModel
import com.suiunbek.domain.usecases.SaveUserDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val saveUserDataUseCase: com.suiunbek.domain.usecases.SaveUserDataUseCase
) : ViewModel() {

    fun saveUser(userModel: com.suiunbek.domain.models.user.UserModel) = saveUserDataUseCase(userModel)
}
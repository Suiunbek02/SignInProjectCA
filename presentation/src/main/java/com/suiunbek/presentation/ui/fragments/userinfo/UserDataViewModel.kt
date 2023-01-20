package com.suiunbek.presentation.ui.fragments.userinfo

import androidx.lifecycle.ViewModel
import com.suiunbek.domain.usecases.GetUserDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserDataViewModel @Inject constructor(
    private val userDataUseCase: com.suiunbek.domain.usecases.GetUserDataUseCase
) : ViewModel() {

    fun getData() = userDataUseCase()
}
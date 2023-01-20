package com.suiunbek.domain.usecases

import com.suiunbek.domain.repositories.UserRepository
import com.suiunbek.domain.models.user.UserModel
import javax.inject.Inject

class SaveUserDataUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    operator fun invoke(userModel: UserModel) = userRepository.savaData(userModel)
}
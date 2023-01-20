package com.suiunbek.domain.usecases

import com.suiunbek.domain.repositories.UserRepository
import javax.inject.Inject

class GetUserDataUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    operator fun invoke() = userRepository.getData()
}
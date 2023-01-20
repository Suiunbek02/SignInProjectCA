package com.suiunbek.domain.repositories

import com.suiunbek.domain.models.user.UserModel

interface UserRepository {

    fun savaData(userModel: UserModel)

    fun getData(): UserModel
}
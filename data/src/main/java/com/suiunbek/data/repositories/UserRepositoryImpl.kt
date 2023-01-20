package com.suiunbek.data.repositories

import com.suiunbek.data.local.models.UserDataModel
import com.suiunbek.data.local.models.toDomain
import com.suiunbek.data.local.preferences.UserPreferenceData
import com.suiunbek.data.remote.api.RickAndMortyApiService
import com.suiunbek.domain.models.user.UserModel
import com.suiunbek.domain.repositories.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val preferenceData: UserPreferenceData,
    private val apiService: RickAndMortyApiService
) : UserRepository {

    override fun savaData(userModel: UserModel) {
        preferenceData.apply {
            userEmail = userModel.userEmail
            userName = userModel.userName
            userAge = userModel.userAge
            userPassword = userModel.userPassword
        }
    }

    override fun getData(): UserModel {
        preferenceData.apply {
            return UserDataModel(
                userName = userName.toString(),
                userAge = userAge.toString(),
                userEmail = userEmail.toString(),
                userPassword = userPassword.toString()
            ).toDomain()
        }
    }
}
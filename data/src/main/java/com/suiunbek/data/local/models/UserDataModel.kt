package com.suiunbek.data.local.models

import com.suiunbek.domain.models.user.UserModel


data class UserDataModel(

    val userName: String,

    val userAge: String,

    val userEmail: String,

    val userPassword: String
)

fun UserDataModel.toDomain() = UserModel(
    userName = userName,
    userAge = userAge,
    userEmail = userEmail,
    userPassword = userPassword
)

fun UserModel.toDomain() = UserDataModel(
    userName = userName,
    userAge = userAge,
    userEmail = userEmail,
    userPassword = userPassword
)

package com.suiunbek.presentation.model

import com.suiunbek.domain.models.rick_and_morty.RickAndMortyModel
import com.suiunbek.presentation.base.IBaseDiffUtil

data class RickAndMortyModelUI(

    override val name: String,
) : IBaseDiffUtil<String>

fun RickAndMortyModel.toUI() = RickAndMortyModelUI(
    name = name
)
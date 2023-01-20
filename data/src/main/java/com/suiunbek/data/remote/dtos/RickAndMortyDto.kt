package com.suiunbek.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.suiunbek.domain.models.rick_and_morty.RickAndMortyModel

data class RickAndMortyDto (

    @SerializedName("name")
    val name: String,
)
    fun RickAndMortyDto.toDomain() = RickAndMortyModel(
name = name,
)
package com.suiunbek.data.remote.api

import com.suiunbek.data.remote.dtos.RickAndMortyDto
import com.suiunbek.data.remote.dtos.RickAndMortyResponse
import retrofit2.http.GET

interface RickAndMortyApiService {

    @GET("api/character")
    suspend fun fetchCharacter(
    ): RickAndMortyResponse<RickAndMortyDto>
}
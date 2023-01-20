package com.suiunbek.data.repositories

import com.suiunbek.data.base.BaseRepository
import com.suiunbek.data.remote.api.RickAndMortyApiService
import com.suiunbek.data.remote.dtos.toDomain
import com.suiunbek.domain.repositories.RickAndMortyRepository
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(
    private val service: RickAndMortyApiService
) : BaseRepository(), RickAndMortyRepository {

    override fun getRickAndMortyList() = doRequest {
        service.fetchCharacter().results.map {
            it.toDomain()
        }
    }
}
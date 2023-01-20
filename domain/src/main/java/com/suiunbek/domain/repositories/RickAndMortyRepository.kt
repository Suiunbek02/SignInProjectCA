package com.suiunbek.domain.repositories

import com.suiunbek.either.Either
import com.suiunbek.domain.models.rick_and_morty.RickAndMortyModel
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {

    fun getRickAndMortyList(): Flow<Either<String, List<RickAndMortyModel>>>
}
package com.suiunbek.domain.usecases.rick_and_morty.get_rick_and_morty

import com.suiunbek.domain.repositories.RickAndMortyRepository
import javax.inject.Inject

class GetRickAndMortyUseCase @Inject constructor(
    private val rickAndMortyRepository: RickAndMortyRepository
) {
operator fun invoke() = rickAndMortyRepository.getRickAndMortyList()
}
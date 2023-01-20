package com.suiunbek.presentation.ui.fragments.rick_and_morty

import androidx.lifecycle.ViewModel
import com.suiunbek.domain.usecases.rick_and_morty.get_rick_and_morty.GetRickAndMortyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RickAndMortyViewModel @Inject constructor(
    private val getRickAndMortyUseCase: GetRickAndMortyUseCase
) : ViewModel() {

  fun getRickAndMorty() = getRickAndMortyUseCase()
}
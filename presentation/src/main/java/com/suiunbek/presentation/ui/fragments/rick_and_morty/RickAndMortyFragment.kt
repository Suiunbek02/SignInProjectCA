package com.suiunbek.presentation.ui.fragments.rick_and_morty

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.suiunbek.either.Either
import com.suiunbek.presentation.R
import com.suiunbek.presentation.base.BaseFragment
import com.suiunbek.presentation.databinding.FragmentRickAndMortyBinding
import com.suiunbek.presentation.model.toUI
import com.suiunbek.presentation.ui.adapters.RickAndMortyAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RickAndMortyFragment :
    BaseFragment<FragmentRickAndMortyBinding, RickAndMortyViewModel>(R.layout.fragment_rick_and_morty) {

    override val binding by viewBinding(FragmentRickAndMortyBinding::bind)
    override val viewModel: RickAndMortyViewModel by viewModels()
    private val rickAndMortyAdapter = RickAndMortyAdapter()

    override fun initialize() {
        binding.rickAndMortyRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = rickAndMortyAdapter
        }
    }

    override fun setupSubscribes() {
        lifecycleScope.launch {
            viewModel.getRickAndMorty().collect {
                when (it) {
                    is Either.Left -> {
                        Log.e("rick", it.massage.toString())
                    }
                    is Either.Right -> {
                        val mappigList = it.data?.map { model ->
                            model.toUI()
                        }
                        rickAndMortyAdapter.submitList(mappigList)
                    }
                }
            }
        }
    }
}
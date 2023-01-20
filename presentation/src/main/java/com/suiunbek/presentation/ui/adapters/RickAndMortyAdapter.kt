package com.suiunbek.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.suiunbek.presentation.base.BaseDiffUtilItemCallback
import com.suiunbek.presentation.databinding.ItemRickAndMortyBinding
import com.suiunbek.presentation.model.RickAndMortyModelUI

class RickAndMortyAdapter :
    ListAdapter<RickAndMortyModelUI, RickAndMortyAdapter.RickAndMortyViewHolder>(
       BaseDiffUtilItemCallback()
    ) {

    class RickAndMortyViewHolder(private val binding: ItemRickAndMortyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: RickAndMortyModelUI) {
         binding.itemName.text = item.name.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickAndMortyViewHolder {
        return RickAndMortyViewHolder(
            ItemRickAndMortyBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RickAndMortyViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}
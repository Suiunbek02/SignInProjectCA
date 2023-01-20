package com.suiunbek.presentation.base

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

class BaseDiffUtilItemCallback<B : IBaseDiffUtil <T>, T>: DiffUtil.ItemCallback<B>() {
    override fun areItemsTheSame(oldItem: B, newItem: B): Boolean {
        return oldItem.name == newItem.name
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: B, newItem: B): Boolean {
        return oldItem == newItem
    }
}
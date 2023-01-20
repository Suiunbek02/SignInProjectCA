package com.suiunbek.presentation.base

interface IBaseDiffUtil<T> {
    val name: T
    override fun equals(other: Any?): Boolean
}
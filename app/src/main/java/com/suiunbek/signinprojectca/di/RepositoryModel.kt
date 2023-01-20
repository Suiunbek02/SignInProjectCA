package com.suiunbek.signinprojectca.di

import com.suiunbek.data.repositories.RickAndMortyRepositoryImpl
import com.suiunbek.data.repositories.UserRepositoryImpl
import com.suiunbek.domain.repositories.RickAndMortyRepository
import com.suiunbek.domain.repositories.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModel {

    @Binds
    fun bindUserRepository(repositoryIml: com.suiunbek.data.repositories.UserRepositoryImpl): com.suiunbek.domain.repositories.UserRepository

    @Binds
    fun bindRickAndMorty(repository: com.suiunbek.data.repositories.RickAndMortyRepositoryImpl): com.suiunbek.domain.repositories.RickAndMortyRepository
}
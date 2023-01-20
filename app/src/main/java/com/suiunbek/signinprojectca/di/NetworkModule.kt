package com.suiunbek.signinprojectca.di

import com.suiunbek.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    private val retrofit = com.suiunbek.data.remote.RetrofitClient()

    @Singleton
    @Provides
    fun provideRickAndMortyApiService() = retrofit.providerRickAndMortyApiService()

}
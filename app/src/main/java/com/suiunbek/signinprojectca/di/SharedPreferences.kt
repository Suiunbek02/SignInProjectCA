package com.suiunbek.signinprojectca.di

import android.content.Context
import com.suiunbek.data.local.preferences.PreferenceHelper
import com.suiunbek.data.local.preferences.UserPreferenceData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPreferences {

    @Provides
    @Singleton
    fun providePreferenceHelper(@ApplicationContext context: Context): com.suiunbek.data.local.preferences.PreferenceHelper {
        return com.suiunbek.data.local.preferences.PreferenceHelper(context)
    }

    @Provides
    @Singleton
    fun provideUserPreferenceData(preferenceHelper: com.suiunbek.data.local.preferences.PreferenceHelper): com.suiunbek.data.local.preferences.UserPreferenceData {
        return com.suiunbek.data.local.preferences.UserPreferenceData(preferenceHelper)
    }
}
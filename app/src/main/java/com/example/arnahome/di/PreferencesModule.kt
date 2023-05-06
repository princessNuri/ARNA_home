package com.example.arnahome.di

import android.content.Context
import android.content.SharedPreferences
import com.example.arnahome.data.local.pref.PreferencesKeys.ARNA_HOME_SHARED_PREFERENCES
import com.example.arnahome.data.local.pref.PreferencesKeys.ULUL_TRIP_SHARED_PREFERENCES
import com.example.arnahome.data.local.pref.UserPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PreferencesModule {

    @Singleton
    @Provides
    fun generateSharedPreferences(@ApplicationContext context: Context): SharedPreferences =
        context.getSharedPreferences(
            ARNA_HOME_SHARED_PREFERENCES,
            Context.MODE_PRIVATE
        )

    @Singleton
    @Provides
    fun generateUserPreferences(sharedPreferences: SharedPreferences) =
        UserPreferences(sharedPreferences)
}
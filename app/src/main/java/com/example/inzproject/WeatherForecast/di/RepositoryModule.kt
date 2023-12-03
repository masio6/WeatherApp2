package com.example.inzproject.WeatherForecast.di

import com.example.inzproject.WeatherForecast.data.location.DefaultLocationTracker
import com.example.inzproject.WeatherForecast.data.repository.WeatherRepositoryImpl
import com.example.inzproject.WeatherForecast.domain.location.LocationTracker
import com.example.inzproject.WeatherForecast.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}
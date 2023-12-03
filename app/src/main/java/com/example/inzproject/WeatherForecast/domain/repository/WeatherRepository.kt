package com.example.inzproject.WeatherForecast.domain.repository

import com.example.inzproject.WeatherForecast.data.remote.WeatherApi
import com.example.inzproject.WeatherForecast.data.remote.WeatherDto
import com.example.inzproject.WeatherForecast.domain.util.Resource
import com.example.inzproject.WeatherForecast.domain.weather.WeatherInfo
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}
package com.example.inzproject.WeatherForecast.presentation

import com.example.inzproject.WeatherForecast.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    var city:String="Yourplace",
    val day:Int = 0,
    val isLoading: Boolean = false,
    val error: String? = null
)

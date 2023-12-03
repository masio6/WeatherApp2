package com.example.inzproject.viewmodels

import android.app.Application
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.inzproject.WeatherForecast.domain.location.LocationTracker
import com.example.inzproject.WeatherForecast.domain.repository.WeatherRepository
import com.example.inzproject.viewmodels.WeatherViewModel
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MainViewModel() : ViewModel() {

    val mapViewModel = MapViewModel()
val weatherViewModel = WeatherViewModel()


    // Pozostała część kodu...
}
@HiltAndroidApp
class WeatherApp: Application()
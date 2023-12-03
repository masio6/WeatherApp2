package com.example.inzproject.viewmodels

import android.content.Context
import android.location.Geocoder
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.inzproject.WeatherForecast.domain.location.LocationTracker
//weatherapp.domain.location.LocationTracker
import com.example.inzproject.WeatherForecast.domain.repository.WeatherRepository
import com.example.inzproject.WeatherForecast.domain.util.Resource
import com.example.inzproject.WeatherForecast.presentation.WeatherState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.IOException
import java.util.*
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private var repository: WeatherRepository,
    private var locationTracker: LocationTracker,
): ViewModel() {

    var cityName: String = "London"

    //  Function to update parameters after construction

    fun printrepo( )
    {
        println(repository)
    }



    var state by mutableStateOf(WeatherState())
        private set

    fun loadWeatherInfo(context: Context, city: String, selecteddateid: Int) {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true,
                error = null
            )
            cityName = "London"
            var isWaiting = true

            if (city == "mylocation") {
                locationTracker!!.getCurrentLocation()!!.let { location ->
                    try {
                        val result = withContext(Dispatchers.IO) {
                            repository!!.getWeatherData(location.latitude, location.longitude)
                        }

                        when (result) {
                            is Resource.Success -> {
                                val geocoder = Geocoder(context, Locale.getDefault())
                                val addresses = geocoder.getFromLocation(
                                    location.latitude,
                                    location.longitude,
                                    1
                                )

                                if (addresses != null) {
                                    cityName = addresses[0].locality
                                    if (cityName != null) {
                                        println("Nazwa miasta na podstawie współrzędnych to: $cityName")
                                    } else {
                                        println("Nie udało się uzyskać nazwy miasta na podstawie współrzędnych.")
                                    }
                                }

                                state = state.copy(
                                    weatherInfo = result.data,
                                    day = selecteddateid,
                                    city = cityName!!,
                                    isLoading = false,
                                    error = null
                                )
                            }
                            is Resource.Error -> {
                                state = state.copy(
                                    weatherInfo = null,
                                    isLoading = false,
                                    error = result.message
                                )
                            }
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                        state = state.copy(
                            isLoading = false,
                            error = "An unknown error occurred."
                        )
                    }
                } ?: kotlin.run {
                    state = state.copy(
                        isLoading = false,
                        error = "Couldn't retrieve location. Make sure to grant permission and enable GPS."
                    )
                }
            } else {
                try {
                    val result = withContext(Dispatchers.IO) {
                        val gc = Geocoder(context, Locale.getDefault())
                        val addresses = gc.getFromLocationName(city, 2)

                        if (addresses != null && addresses.isNotEmpty()) {
                            val address = addresses[0]

                            repository!!.getWeatherData(address.latitude, address.longitude)
                        } else {
                            null
                        }
                    }

                    when (result) {
                        is Resource.Success -> {
                            state = state.copy(
                                weatherInfo = result.data,
                                isLoading = false,
                                city = city,
                                day = selecteddateid,
                                error = null
                            )
                        }
                        is Resource.Error -> {
                            state = state.copy(
                                weatherInfo = null,
                                isLoading = false,
                                error = result.message
                            )
                        }
                        else -> {}
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                    state = state.copy(
                        isLoading = false,
                        error = "An unknown error occurred."
                    )
                }
            }

            // Operacja sieciowa została zakończona, więc ustaw flagę isWaiting na false.
            isWaiting = false
        }
    }}





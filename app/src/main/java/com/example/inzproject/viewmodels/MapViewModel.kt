package com.example.inzproject.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.inzproject.states.MapState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor() : ViewModel() {
    var state by mutableStateOf(MapState())

    var latitude by mutableStateOf(50.262606656386104)

    var longitude by mutableStateOf(19.03967912803772)

    var zoom by mutableStateOf(12f)
}

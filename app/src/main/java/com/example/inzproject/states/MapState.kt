package com.example.inzproject.states

import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties: MapProperties = MapProperties(minZoomPreference = 3.25F),
)

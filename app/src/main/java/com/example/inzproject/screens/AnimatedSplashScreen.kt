package com.example.inzproject.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.inzproject.helpfunctions.createGradientBrush
import com.example.inzproject.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun AnimatedSplashScreen(navController: NavController) {
    var startAnimation by remember { mutableStateOf(false) }

    val alphaAnimation = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 1250
        )
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(2000)
        navController.popBackStack()
        navController.navigate(Routes.Main.route)
    }

    SplashScreen(alpha = alphaAnimation.value)
}

@Composable
fun SplashScreen(alpha: Float) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            createGradientBrush(
            listOf(
                MaterialTheme.colorScheme.background,
                MaterialTheme.colorScheme.background.copy(alpha = 0.85f)
            )
        )
        ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(125.dp).alpha(alpha),
            imageVector = Icons.Default.Person,
            contentDescription = "App Icon",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
@Preview
fun SplashPreview() {
    SplashScreen(alpha = 1f)
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun SplashPreviewDarkMode() {
    SplashScreen(alpha = 1f)
}
package com.hello.curiosity.curiosity.ui.scenes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hello.curiosity.compose.ui.components.BottomNavigation
import com.hello.curiosity.curiosity.navigation.DashboardNavigationConfiguration
import com.hello.curiosity.curiosity.ui.scenes.color.ColorScene
import com.hello.curiosity.curiosity.ui.scenes.type.TypographyScene

@Composable
fun DashboardScene() {
    val navController = rememberNavController()

    val scenes = listOf(
        BottomNavScenes.Color,
        BottomNavScenes.Typography
    )

    Scaffold(
        bottomBar = {
            BottomNavigation(navController = navController, scenes = scenes)
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding)) {
            DashboardNavigationConfiguration(
                navController = navController
            )
        }
    }
}

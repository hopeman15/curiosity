package com.hello.curiosity.ui.theme

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.hello.curiosity.compose.ui.theme.CuriosityTheme

@Suppress("FunctionName")
fun ComponentActivity.ComposeContentView(content: @Composable () -> Unit) =
    setContent {
        CuriosityTheme(
            theme = AppTheme
        ) {
            content()
        }
    }

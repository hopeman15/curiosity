package com.hello.curiosity.curiosity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hello.curiosity.compose.ui.theme.CuriosityTheme
import com.hello.curiosity.curiosity.ui.scenes.DashboardScene
import com.hello.curiosity.curiosity.ui.theme.ComposeContentView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ComposeContentView {
            DashboardScene()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CuriosityTheme {
        DashboardScene()
    }
}
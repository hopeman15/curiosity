package com.hello.curiosity.compose.ui.components.text

import androidx.compose.runtime.Composable
import com.hello.curiosity.compose.ui.ComposeTextTest
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ContentLargeTest : ComposeTextTest() {
    override val text: String = "Label Text"
    override val content: @Composable () -> Unit = { ContentLarge(text = text) }
}

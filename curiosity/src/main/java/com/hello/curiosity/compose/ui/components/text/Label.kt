package com.hello.curiosity.compose.ui.components.text

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Label(
    text: String,
) = Text(
    text = text,
    style = MaterialTheme.typography.h6
)

@Preview
@Composable
fun LabelPreview() {
    Label(text = "Label")
}

package com.steleot.jetpackcompose.playground.compose.animation

import androidx.compose.runtime.Composable
import com.steleot.jetpackcompose.playground.AnimationNavRoutes
import com.steleot.jetpackcompose.playground.compose.reusable.DefaultScaffold
import java.util.*

@Composable
fun SingleValueColorAnimationScreen() {
    DefaultScaffold(
        title = AnimationNavRoutes.SingleValueColorAnimation.capitalize(Locale.getDefault())
    ) {

    }
}
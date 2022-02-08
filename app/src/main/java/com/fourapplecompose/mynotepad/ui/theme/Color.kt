package com.fourapplecompose.mynotepad.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightYellow = Color(0xFFfff59d)
val Amber500 = Color(0xFFffc107)

val MediumGreen = Color(0xFF3EB33E)



val Colors.newBackgroundColor: Color
    @Composable
    get() = if (isLight) LightYellow else Amber500

val Colors.mediumGreen: Color
    @Composable
    get() = if (isLight) MediumGreen else MediumGreen
package com.example.crea_una_cuadricula.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cuadricula(
    @StringRes val name: Int,
    val availableCourses: Int,
    @DrawableRes val imageRes: Int
)

package com.example.a30diasdehabitos.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Habit(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
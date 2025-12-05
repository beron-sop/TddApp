package com.example.tddapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemModel(
    val label: String,
    val text: String
) : Parcelable

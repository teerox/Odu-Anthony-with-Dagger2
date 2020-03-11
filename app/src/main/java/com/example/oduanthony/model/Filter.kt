package com.example.oduanthony.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize



import kotlinx.serialization.*
import kotlinx.serialization.internal.*

typealias FilterArray = ArrayList<Filter>


@Parcelize
data class Filter (
    val id: String,
    val avatar: String,
    val fullName:  String,
    val createdAt: String,
    val gender: String,
    val colors: List<String>,
    val countries: List<String>
):Parcelable

package com.dicoding.mymoviecatalogue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MoviesEntity(
    var title: String,
    var img: Int,
    var des: String
) : Parcelable
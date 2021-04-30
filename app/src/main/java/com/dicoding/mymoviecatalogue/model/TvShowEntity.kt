package com.dicoding.mymoviecatalogue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowEntity(
    var title: String,
    var img: Int,
    var des: String
) : Parcelable
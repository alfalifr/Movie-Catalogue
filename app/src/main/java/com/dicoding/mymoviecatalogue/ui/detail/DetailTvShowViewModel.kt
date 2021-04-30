package com.dicoding.mymoviecatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.mymoviecatalogue.model.TvShowEntity

class DetailTvShowViewModel : ViewModel() {
    private lateinit var tvShow: TvShowEntity


    fun getTvShow(): TvShowEntity = tvShow

    fun setTvShow(moviesEntity: TvShowEntity) {
        tvShow = moviesEntity
    }

}
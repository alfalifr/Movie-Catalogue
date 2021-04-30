package com.dicoding.mymoviecatalogue.ui.movies

import androidx.lifecycle.ViewModel
import com.dicoding.mymoviecatalogue.model.MoviesEntity
import com.dicoding.mymoviecatalogue.utils.DataDummy

class MoviesViewModel : ViewModel() {
    fun getMovies(): List<MoviesEntity> = DataDummy.listMovie()
}
package com.dicoding.mymoviecatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.mymoviecatalogue.model.MoviesEntity

class DetailMoviesViewModel : ViewModel() {
    private lateinit var movie: MoviesEntity

    fun getMovies(): MoviesEntity = movie

    fun setMovies(moviesEntity: MoviesEntity) {
        movie = moviesEntity
    }

}
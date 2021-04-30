package com.dicoding.mymoviecatalogue.ui.detail

import com.dicoding.mymoviecatalogue.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMoviesViewModelTest {

    private lateinit var viewModel: DetailMoviesViewModel

    @Before
    fun setUp() {
        viewModel = DetailMoviesViewModel()
    }

    @Test
    fun getMovies() {
        viewModel.setMovies(DataDummy.listMovie()[1])
        val movieEntities = viewModel.getMovies()
        assertNotNull(movieEntities)
        assertEquals(DataDummy.listMovie()[1].title, movieEntities.title)
        assertEquals(DataDummy.listMovie()[1].img, movieEntities.img)
        assertEquals(DataDummy.listMovie()[1].des, movieEntities.des)
    }
}
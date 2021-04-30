package com.dicoding.mymoviecatalogue.ui.tvshow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {

    private lateinit var viewModel : TvShowViewModel

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val movieEntities = viewModel.getTvShow()
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities.size)
    }
}
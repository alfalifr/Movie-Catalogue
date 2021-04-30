package com.dicoding.mymoviecatalogue.ui.detail

import com.dicoding.mymoviecatalogue.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel()
    }

    @Test
    fun getTvShow() {
        viewModel.setTvShow(DataDummy.listTvShow()[0])
        val movieEntities = viewModel.getTvShow()
        assertNotNull(movieEntities)
        assertEquals(DataDummy.listTvShow()[0].title, movieEntities.title)
        assertEquals(DataDummy.listTvShow()[0].img, movieEntities.img)
        assertEquals(DataDummy.listTvShow()[0].des, movieEntities.des)
    }

}
package com.dicoding.mymoviecatalogue.ui.tvshow

import androidx.lifecycle.ViewModel
import com.dicoding.mymoviecatalogue.model.TvShowEntity
import com.dicoding.mymoviecatalogue.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShow(): List<TvShowEntity> = DataDummy.listTvShow()

}
package com.dicoding.mymoviecatalogue.ui.detail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dicoding.mymoviecatalogue.R
import com.dicoding.mymoviecatalogue.model.TvShowEntity

class DetailTvShowActivity : AppCompatActivity() {

    lateinit var viewModel: DetailTvShowViewModel

    companion object {
        const val EXTRA_DETAIL_TVSHOW = "extra_detail_tvshow"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv_show)

        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailTvShowViewModel::class.java]
        intent.getParcelableExtra<TvShowEntity>(EXTRA_DETAIL_TVSHOW)
            ?.let { viewModel.setTvShow(it) }

        updateView()
    }

    fun updateView() {

        findViewById<TextView>(R.id.tvTitle).text = viewModel.getTvShow().title
        findViewById<TextView>(R.id.tvDes).text = viewModel.getTvShow().des
        findViewById<ImageView>(R.id.ivPoster).setImageResource(viewModel.getTvShow().img)
    }
}
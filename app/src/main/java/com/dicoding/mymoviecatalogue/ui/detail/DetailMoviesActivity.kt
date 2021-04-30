package com.dicoding.mymoviecatalogue.ui.detail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dicoding.mymoviecatalogue.R
import com.dicoding.mymoviecatalogue.model.MoviesEntity

class DetailMoviesActivity : AppCompatActivity() {
    lateinit var viewModel: DetailMoviesViewModel

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movies)


        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailMoviesViewModel::class.java]
        intent.getParcelableExtra<MoviesEntity>(EXTRA_DETAIL)?.let { viewModel.setMovies(it) }

        updateView()
    }


    fun updateView() {
        findViewById<TextView>(R.id.tvTitle).text = viewModel.getMovies().title
        findViewById<TextView>(R.id.tvDes).text = viewModel.getMovies().des
        findViewById<ImageView>(R.id.ivPoster).setImageResource(viewModel.getMovies().img)

    }


}
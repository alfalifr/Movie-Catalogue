package com.dicoding.mymoviecatalogue.ui.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.mymoviecatalogue.R
import com.dicoding.mymoviecatalogue.ui.movies.MoviesAdapter
import com.dicoding.mymoviecatalogue.ui.movies.MoviesViewModel


/**
 * A simple [Fragment] subclass.
 * created by Nabila Herman.
 */
class MoviesFragment : Fragment() {

    private lateinit var adapter: MoviesAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listMovie(view)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[MoviesViewModel::class.java]
        val movies = viewModel.getMovies()
        adapter.setMovie(movies)


    }


    private fun listMovie(view: View) {
        val rvMovie = view.findViewById<RecyclerView>(R.id.rvMovies)
        adapter = MoviesAdapter()
        rvMovie.layoutManager = GridLayoutManager(requireContext(), 2)
        rvMovie.adapter = adapter
    }

}
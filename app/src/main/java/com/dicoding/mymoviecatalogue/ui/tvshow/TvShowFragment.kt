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
import com.dicoding.mymoviecatalogue.ui.tvshow.TvShowAdapter
import com.dicoding.mymoviecatalogue.ui.tvshow.TvShowViewModel


/**
 * A simple [Fragment] subclass.
 * created by Nabila Herman.
 */
class TvShowFragment : Fragment() {

    private lateinit var adapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_tv_show, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listMovie(view)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[TvShowViewModel::class.java]
        val movies = viewModel.getTvShow()
        adapter.setMovie(movies)
    }


    private fun listMovie(view: View) {
        val rvTvShows = view.findViewById<RecyclerView>(R.id.rvTvshow)
        adapter = TvShowAdapter()
        rvTvShows.layoutManager = GridLayoutManager(requireContext(), 2)
        rvTvShows.adapter = adapter
    }

}
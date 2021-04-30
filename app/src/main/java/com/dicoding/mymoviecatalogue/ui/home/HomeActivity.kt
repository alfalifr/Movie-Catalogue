package com.dicoding.mymoviecatalogue.ui.home

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.dicoding.mymoviecatalogue.R
import com.dicoding.mymoviecatalogue.ui.favorite.FavoriteFragment
import com.dicoding.mymoviecatalogue.ui.favorite.MoviesFragment
import com.dicoding.mymoviecatalogue.ui.favorite.TvShowFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val moviesFragment = MoviesFragment()
        val tvShowFragment = TvShowFragment()
        val favouriteFragment = FavoriteFragment()

        setCurrentFragment(moviesFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_movies -> {
                    setCurrentFragment(moviesFragment)
                    Log.i(TAG, "Movies Selected")
                }
                R.id.nav_favourite -> {
                    setCurrentFragment(favouriteFragment)
                    Log.i(TAG, "Favourites Selected")
                }
                R.id.nav_tvshow -> {
                    setCurrentFragment(tvShowFragment)
                    Log.i(TAG, "Tv Show Selected")
                }
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_wrapper, fragment)
            commit()
        }

}



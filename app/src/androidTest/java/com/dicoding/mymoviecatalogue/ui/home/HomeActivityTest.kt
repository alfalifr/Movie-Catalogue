package com.dicoding.mymoviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.mymoviecatalogue.R
import com.dicoding.mymoviecatalogue.utils.DataDummy
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test


class HomeActivityTest{
    private val movie = DataDummy.listMovie()
    private val tvShow = DataDummy.listTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rvMovies)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movie.size))
    }

    @Test
    fun loadDetailMovies() {
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(movie[0].title)))
        onView(withId(R.id.tvDes)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDes)).check(matches(withText(movie[0].des)))
        onView(withId(R.id.ivPoster)).check(matches(isDisplayed()))
    }

    @Test
    fun loadTvShow() {
        onView(withId(R.id.rvTvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(movie[0].title)))
        onView(withId(R.id.tvDes)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDes)).check(matches(withText(movie[0].des)))
        onView(withId(R.id.ivPoster)).check(matches(isDisplayed()))
    }
}
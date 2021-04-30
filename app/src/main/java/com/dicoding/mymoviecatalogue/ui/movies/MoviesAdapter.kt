package com.dicoding.mymoviecatalogue.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.mymoviecatalogue.R
import com.dicoding.mymoviecatalogue.model.MoviesEntity
import com.dicoding.mymoviecatalogue.ui.detail.DetailMoviesActivity

class MoviesAdapter :
    RecyclerView.Adapter<MoviesAdapter.CardViewViewHolder>() {
    private var listMovie = mutableListOf<MoviesEntity>()
    fun setMovie(movie: List<MoviesEntity>) {
        listMovie.clear()
        listMovie.addAll(movie)
        notifyDataSetChanged()
    }


    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.ivPoster)
        var tvName: TextView = itemView.findViewById(R.id.tvTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.tvName.text = movie.title
        holder.imgPhoto.setImageResource(movie.img)
        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailMoviesActivity::class.java)
            moveDetail.putExtra(DetailMoviesActivity.EXTRA_DETAIL, movie)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

}

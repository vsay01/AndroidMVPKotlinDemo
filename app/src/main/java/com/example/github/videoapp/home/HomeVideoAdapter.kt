package com.example.github.videoapp.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.github.videoapp.BuildConfig
import com.example.github.videoapp.R
import com.example.github.videoapp.models.VideoContent

/**
 * Created on 7/29/17.
 */
class HomeVideoAdapter(var videoContentList: List<VideoContent>, var clickListener: OnItemClickListener) :
        RecyclerView.Adapter<HomeVideoAdapter.VideoViewHolder>() {

    override fun onBindViewHolder(holder: VideoViewHolder?, position: Int) {
        val videoContent = videoContentList[position]
        holder?.mTags?.text = videoContent.tags
        holder?.mLikes?.text = "Likes: " + videoContent.likes.toString()
        holder?.mFavorites?.text = "Favorites: " + videoContent.favorites.toString()
        if (videoContent.picture_id.isNotEmpty()) {
            Glide.with(holder?.mTags?.context)
                    .load(BuildConfig.IMG_BASE_URL + videoContent.picture_id + "_640x360.jpg")
                    .into(holder?.mVideoImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): VideoViewHolder {
        return VideoViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.video_item, parent, false), clickListener)
    }

    override fun getItemCount(): Int {
        return videoContentList.size
    }

    fun getVideo(adapterPosition: Int): VideoContent {
        return videoContentList[adapterPosition]
    }

    inner class VideoViewHolder(itemView: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(itemView) {
        var mTags: TextView = itemView.findViewById<TextView>(R.id.tags)
        var mLikes: TextView = itemView.findViewById<TextView>(R.id.likes)
        var mFavorites: TextView = itemView.findViewById<TextView>(R.id.favorites)
        var mVideoImg: ImageView = itemView.findViewById<ImageView>(R.id.video_item)
        var mBtnPlay: ImageView = itemView.findViewById<ImageView>(R.id.iv_button)

        init {
            mBtnPlay.setOnClickListener { v -> listener.onViewClicked(v, adapterPosition) }
        }
    }
}
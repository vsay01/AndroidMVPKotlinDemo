package com.example.github.videoapp.models

import java.io.Serializable

/**
 * Created on 7/29/17.
 */

data class VideoContent(val picture_id: String,
                        val likes: Int,
                        var videos: Videos,
                        val favorites: Int,
                        val tags: String,
                        val downloads: Int,
                        val duration: Int,
                        val userImageURL: String,
                        val type: String,
                        val user: String) : Serializable
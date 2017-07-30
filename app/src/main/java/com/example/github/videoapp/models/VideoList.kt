package com.example.github.videoapp.models

/**
 * Created on 7/29/17.
 * data comes back from server as array of videoContentList
 */
data class VideoList(val hits : List<VideoContent>)
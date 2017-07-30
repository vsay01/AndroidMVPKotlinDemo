package com.example.github.videoapp.api

import com.example.github.videoapp.BuildConfig
import com.example.github.videoapp.models.VideoList
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created on 7/29/17.
 */
class VideoRetriever {
    private val mService: VideoApi

    init {
        val retrofit = Retrofit.Builder().
                baseUrl(BuildConfig.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

        /*Class dot Java is Kotlin's way of referencing a Java class object.
        What this does is use Retrofit's builder class to construct an API mService for us.*/
        mService = retrofit.create(VideoApi::class.java)
    }

    /*This method takes a callback that will be called once the API call has finished.
    This method calls our mService and then enqueues it, which means that it will run asynchronously.*/
    fun getVideo(callBack: Callback<VideoList>) {
        val videos = mService.getVideos()
        videos.enqueue(callBack)
    }
}
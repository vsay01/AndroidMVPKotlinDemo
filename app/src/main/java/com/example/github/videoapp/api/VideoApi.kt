package com.example.github.videoapp.api

import com.example.github.videoapp.BuildConfig
import com.example.github.videoapp.models.VideoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created on 7/29/17.
 */
interface VideoApi {
    /*This function will return the type of call video list, call is Retrofit type, when you receive this type back,
    you will have to either have to enqueue it, which means make an asynchronous call, or execute it,
    which will run it synchronously. Now we'll add an annotation that Retrofit needs to create the API.
    * */
    @GET("videos/?key=" + BuildConfig.API_KEY)
    fun getVideos(): Call<VideoList>
}
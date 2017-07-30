package com.example.github.videoapp.home

import com.example.github.videoapp.base.BaseContract
import com.example.github.videoapp.models.VideoList
import retrofit2.Call
import retrofit2.Response


/**
 * Created on 7/29/17.
 */

class HomeContract {
    interface View : BaseContract.View<Presenter> {
        fun showGetVideoOnFailure(call: Call<VideoList>?, t: Throwable?)

        fun showGetVideoList(response: Response<VideoList>?)
    }

    interface Presenter : BaseContract.Presenter {
        fun getVideoList()
    }
}
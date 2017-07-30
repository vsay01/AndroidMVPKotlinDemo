package com.example.github.videoapp.videoplayer

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.MediaController
import android.widget.ProgressBar
import android.widget.VideoView
import com.example.github.videoapp.R


/**
 * Created on 7/29/17.
 */
class VideoPlayer : AppCompatActivity() {

    companion object {
        const val VIDEO_CONTENT = "VIDEO_CONTENT"
    }

    lateinit var videoURL: String
    lateinit var videoView: VideoView
    lateinit var controller: MediaController
    lateinit var vidUri: Uri
    lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_activity)

        initView()

        videoView.setVideoURI(vidUri)
        videoView.setMediaController(controller)
        videoView.start()

        progressBar.setVisibility(View.VISIBLE)
        videoView.setOnPreparedListener { mediaPlayer ->
            mediaPlayer.start()
            mediaPlayer.setOnVideoSizeChangedListener { mediaPlayer, _, _ ->
                // TODO Auto-generated method stub
                progressBar.setVisibility(View.GONE)
                mediaPlayer.start()
            }
        }
    }

    fun initView() {
        videoURL = intent.getExtras().getString(VIDEO_CONTENT)
        progressBar = findViewById<ProgressBar>(R.id.progressbar)
        videoView = findViewById<VideoView>(R.id.video_view)
        controller = MediaController(this)
        vidUri = Uri.parse(videoURL)
    }
}
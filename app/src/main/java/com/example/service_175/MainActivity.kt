package com.example.service_175

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/wiku.agil.7?ref=bookmarks"))
            startActivity(i)
        })
            btn_instagram.setOnClickListener({
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/langitinspirasi.co.id"))
                startActivity(i)

        })

        var MediaPlayer : MediaPlayer? = MediaPlayer.create(this,R.raw.hello)

        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        btn_pause.setOnClickListener{
            MediaPlayer?.start()
        }

        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}

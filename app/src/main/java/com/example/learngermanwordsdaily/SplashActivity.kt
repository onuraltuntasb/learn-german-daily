package com.example.learngermanwordsdaily

import GifDrawableImageViewTarget
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


    }

    override fun onResume() {
//        Glide.with(applicationContext).load(R.drawable.sandwatch).into(GifDrawableImageViewTarget(imgLoading, 2))
        object:CountDownTimer(1500,1000){
            override fun onFinish() {

                var intent=Intent(this@SplashActivity,MainActivity::class.java)
                startActivity(intent)
            }

            override fun onTick(p0: Long) {

            }

        }.start()
        super.onResume()
    }
}

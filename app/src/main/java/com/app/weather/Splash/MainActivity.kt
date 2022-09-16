package com.app.weather.Splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import app.w8r.Common.BaseActivity
import app.w8r.Common.MyUtils
import butterknife.ButterKnife
import butterknife.OnClick
import com.app.weather.DashBoard.DashBoard
import com.app.weather.R
import com.app.weather.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)
        ButterKnife.bind(this,binding.root)

        hideStatusBar()
        hideNavigationBar()

        MyUtils.animateAlpha(binding.headerTv,1.0f,1000,0)
        MyUtils.animateAlpha(binding.hintTv,1.0f,1000,300)
        MyUtils.animateAlpha(binding.startBtn,1.0f,1000,600)

        binding.startBtn.setOnClickListener({
            Log.i("datadata","pressed");
            finish()
            startActivity(Intent(this,DashBoard::class.java))
        })
    }




}
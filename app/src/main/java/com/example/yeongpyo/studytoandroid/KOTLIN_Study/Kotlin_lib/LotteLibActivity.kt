package com.example.yeongpyo.studytoandroid.KOTLIN_Study.Kotlin_lib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.yeongpyo.studytoandroid.R
import kotlinx.android.synthetic.main.activity_lotte_lib.*

class LotteLibActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotte_lib)

        animationTest.setOnClickListener {
            animationTest.playAnimation()
        }
    }

    override fun onResume() {
        super.onResume()
        animationTest.progress = 1F
    }
}

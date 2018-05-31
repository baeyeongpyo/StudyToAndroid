package com.example.yeongpyo.studytoandroid.KOTLIN_Study.Material_Design

import android.graphics.Rect
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.transition.Transition
import android.transition.TransitionManager
import android.view.View
import com.example.yeongpyo.studytoandroid.R
import kotlinx.android.synthetic.main.activity_animation_view_test.*

class animationViewTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_view_test)

        transitionButton.setOnClickListener {
//            TransitionManager.beginDelayedTransition(animationContrainMain)
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { TransitionManager.beginDelayedTransition(animationContrainMain, Slide(Gravity.RIGHT)) }
            val  viewrect = Rect()
            it.getGlobalVisibleRect(viewrect)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val explode : Transition = Explode().apply { setEpicenterCallback(object : Transition.EpicenterCallback() { override fun onGetEpicenter(p0: Transition?): Rect = viewrect }) }
                explode.duration = 1000
                TransitionManager.beginDelayedTransition(animationContrainMain, explode)
            }
//            animation_Textview.visibility = if ( animation_Textview.visibility == View.VISIBLE ) View.GONE  else View.VISIBLE
        }
    }
}

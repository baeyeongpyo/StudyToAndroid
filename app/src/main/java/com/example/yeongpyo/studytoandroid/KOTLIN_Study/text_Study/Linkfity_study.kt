package com.example.yeongpyo.studytoandroid.KOTLIN_Study.text_Study

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.text.SpannableString
import android.text.TextPaint
import android.text.util.Linkify
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView
import com.example.yeongpyo.studytoandroid.R
import java.util.regex.Pattern

/**
 * Created by yeongpyo on 2018-03-12.
 */
class Linkfity_study : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_linkfity)

        var textview = findViewById<TextView>(R.id.Linkfity_textView)
        textview.setLinkTextColor(Color.GREEN)
        textview.setText("링크 걸기, 링크 테스트")

        var mfilter = Linkify.TransformFilter { matcher, s -> "" }
        var pattern1 = Pattern.compile("걸기")
        var pattern2 = Pattern.compile("테스트")

        Linkify.addLinks(textview, pattern1, "http://www.naver.com", null, mfilter)
        Linkify.addLinks(textview, pattern2, "http://www.google.com", null, mfilter)

    }
}
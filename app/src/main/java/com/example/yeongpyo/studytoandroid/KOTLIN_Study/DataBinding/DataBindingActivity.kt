package com.example.yeongpyo.studytoandroid.KOTLIN_Study.DataBinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.yeongpyo.studytoandroid.R
import kotlinx.android.synthetic.main.activity_data_binding.*

class DataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding)
        tvtest.setText("aa")


    }
}

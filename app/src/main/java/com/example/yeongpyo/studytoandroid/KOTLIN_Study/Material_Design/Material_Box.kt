package com.example.yeongpyo.studytoandroid.KOTLIN_Study.Material_Design

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.yeongpyo.studytoandroid.R
import kotlinx.android.synthetic.main.activity_material__box.*

class Material_Box : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material__box)
        with(this){
            some_chip.closeIcon = this.resources.getDrawable(android.R.drawable.ic_menu_close_clear_cancel, null)
        }
    }
}

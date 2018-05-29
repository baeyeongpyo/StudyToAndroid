package com.example.yeongpyo.studytoandroid.KOTLIN_Study

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import android.widget.TextView
import android.widget.Toast
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.ClipBoardManager.Clip_StudyActivity
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.Kotlin_lib.Kotlin_lib_Prograss
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.Kotlin_lib.LotteLibActivity
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.Material_Design.BottomBehaviorActivity
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.Material_Design.Material_Box
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.Material_Design.coordinatorActivity
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.Rxtest.RXjava2Kotlin_Testing
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.text_Study.Linkfity_study
import com.example.yeongpyo.studytoandroid.R
import java.util.*
import kotlin.collections.HashMap

class KOTLINMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_main)

        val category_1  = HashMap<String , Class<*>>().apply {
            put("Linkify", Linkfity_study::class.java)
            put("ClipBoard", Clip_StudyActivity::class.java)
        }


        val category_2  = HashMap<String, Class<*>>().apply {
            put("Material Box", Material_Box::class.java)
            put("Coordinator Layout", coordinatorActivity::class.java)
            put("BottomBehaviorActivity", BottomBehaviorActivity::class.java)
        }

        val category_3 = HashMap<String, Class<*>>().apply {
            put("Rx java Test ( Rx API )", RXjava2Kotlin_Testing::class.java)
        }

        val category_4 = HashMap<String, Class<*>>().apply {
            put(" Kotlin Lib Prograss", Kotlin_lib_Prograss::class.java)
            put(" Lottie Lib", LotteLibActivity::class.java)
        }
        var totalCategory  = HashMap<String, Class<*>>().apply {
            putAll(category_1)
            putAll(category_2)
            putAll(category_3)
            putAll(category_4)
        }

        var map = LinkedHashMap<String, ArrayList<String>>()
        map.put("text_Study" , ArrayList(category_1.keys))
        map.put("Material Design" , ArrayList(category_2.keys))
        map.put("ReactX" , ArrayList(category_3.keys))
        map.put("Kotlin Lib" , ArrayList(category_4.keys))

        var elv_list : ExpandableListView = findViewById(R.id.main_elv_listview)
        elv_list.setAdapter(KOTLINMain_adapter(map))
       elv_list.setOnChildClickListener({expandableListView, view, i1, i2, l ->
            var EnterClass = view.findViewById<TextView>(R.id.childTextview).text
            startActivity(Intent(applicationContext, totalCategory.get(EnterClass)))
            true})
        }

        private fun totalMap (vararg maps : HashMap<String , Class<*>> ): HashMap<String, Class<*>> {
            var totalCategory : HashMap<String, Class<*>> = HashMap()
            for ( mapItem in maps) totalCategory.putAll(mapItem)
            return totalCategory
        }
    }


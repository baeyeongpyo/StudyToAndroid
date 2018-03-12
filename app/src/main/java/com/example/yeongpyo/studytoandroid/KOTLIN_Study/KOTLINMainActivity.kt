package com.example.yeongpyo.studytoandroid.KOTLIN_Study

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import android.widget.TextView
import android.widget.Toast
import com.example.yeongpyo.studytoandroid.KOTLIN_Study.text_Study.Linkfity_study
import com.example.yeongpyo.studytoandroid.R
import java.util.*
import kotlin.collections.HashMap

class KOTLINMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_main)

        var category_1 : HashMap<String , Class<*>> = HashMap()
        category_1.put("Linkify", Linkfity_study::class.java)

        var totalCategory : HashMap<String, Class<*>> = HashMap()
        totalCategory.putAll(category_1)

        var map = LinkedHashMap<String, ArrayList<String>>()
        map.put("text_Study" , ArrayList(category_1.keys))

        var elv_list : ExpandableListView = findViewById<ExpandableListView>(R.id.main_elv_listview)
        elv_list.setAdapter(KOTLINMain_adapter(map))
        elv_list.setOnChildClickListener({expandableListView, view, i1, i2, l ->
            var EnterClass = view.findViewById<TextView>(R.id.childTextview).text
            startActivity(Intent(applicationContext, totalCategory.get(EnterClass)))
            true})
        }
    }


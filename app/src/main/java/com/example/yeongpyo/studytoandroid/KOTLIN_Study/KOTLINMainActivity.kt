package com.example.yeongpyo.studytoandroid.KOTLIN_Study

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

        var map = LinkedHashMap<String, ArrayList<String>>()
        map.put("text_Study" , ArrayList(category_1.keys))
        map.put("test2" , ArrayList(Arrays.asList("5","6","7","8")))
        map.put("test3" , ArrayList(Arrays.asList("9","10","11","12")))
        map.put("test4" , ArrayList(Arrays.asList("13","14,","15","16")))

        var elv_list : ExpandableListView = findViewById<ExpandableListView>(R.id.main_elv_listview)
        elv_list.setAdapter(KOTLINMain_adapter(map))
        elv_list.setOnChildClickListener(ExpandableListView.OnChildClickListener { expandableListView, view, i1, i2, l ->
            Toast.makeText(this, view.findViewById<TextView>(R.id.childTextview).text , Toast.LENGTH_SHORT).show()
            true})
        }
    }


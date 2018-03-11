package com.example.yeongpyo.studytoandroid.KOTLIN_Study

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import com.example.yeongpyo.studytoandroid.R
import java.util.*

class KOTLINMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_main)

        var map = LinkedHashMap<String, ArrayList<String>>();
        map.put("test1" , ArrayList<String>(Arrays.asList("1","2","3","4")))
        map.put("test2" , ArrayList<String>(Arrays.asList("5","6","7","8")))
        map.put("test3" , ArrayList<String>(Arrays.asList("9","10","11","12")))
        map.put("test4" , ArrayList<String>(Arrays.asList("13","14,","15","16")))

        findViewById<ExpandableListView>(R.id.main_elv_listview).setAdapter(KOTLINMain_adapter(map))
    }
}

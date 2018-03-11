package com.example.yeongpyo.studytoandroid.KOTLIN_Study

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.yeongpyo.studytoandroid.R
import java.util.ArrayList
import java.util.LinkedHashMap

/**
 * Created by yeongpyo on 2018-03-11.
 */
class KOTLINMain_adapter(var map : LinkedHashMap<String, ArrayList<String>>):BaseExpandableListAdapter() {

    var arr = ArrayList<String>()

    init { for (txt in map.keys) arr.add(txt) }

    override fun getGroup(p0: Int): Any { return p0}

    override fun isChildSelectable(p0: Int, p1: Int): Boolean { return true }

    override fun hasStableIds(): Boolean { return true }

    override fun getChildId(p0: Int, p1: Int): Long { return p1.toLong() }

    override fun getGroupCount(): Int { return map.size }

    override fun getChildrenCount(p0: Int): Int { return map.get(arr.get(p0))!!.size }

    override fun getChild(p0: Int, p1: Int): Any { return p1 }

    override fun getGroupId(p0: Int): Long { return p0.toLong() }

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
        var v : View = LayoutInflater.from(p3!!.context).inflate(R.layout.childlayout, p3, false)
        var holder = GroupHolder(v)
        holder.textview.setText(arr.get(p0))
        return v
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
        var v : View = LayoutInflater.from(p4!!.context).inflate(R.layout.childlayout, p4, false)
        var holder = ChildHolder(v)
        holder.textview.setText(map.get(arr.get(p0))!!.get(p1))
        return v
    }

    class GroupHolder(var view : View){
        var textview : TextView
        init {textview = view.findViewById(R.id.childTextview)}
    }
    class ChildHolder(var view : View){
        var textview : TextView
        init {textview = view.findViewById(R.id.childTextview)}
    }

}
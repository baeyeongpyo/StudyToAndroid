package com.example.yeongpyo.studytoandroid

import org.json.JSONArray
import org.json.JSONObject
import org.junit.Test

class jsonarrtest {
    @Test
    fun jsonarr(){

        var testjsonObject = JSONObject()
        var jsonarrtest = JSONArray().apply {
            put("aa")
            put("bb")
            put("cc")
            put("dd")
        }
        println(jsonarrtest)
        testjsonObject.put("test", jsonarrtest)

        println(testjsonObject.toString())
        println("Asdf")

        Thread.sleep(1000)

    }
}
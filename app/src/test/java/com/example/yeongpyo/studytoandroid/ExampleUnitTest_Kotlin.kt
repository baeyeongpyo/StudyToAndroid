package com.example.yeongpyo.studytoandroid

import org.junit.Test

/**
 * Created by yeongpyo on 2018-03-12.
 */
class ExampleUnitTest_Kotlin  {
    @Test
    fun addition_isCorrect() {

        var map : HashMap<String, Int> = HashMap()
        map.put("a",1)
        map.put("b",2)
        map.put("c",3)

        var  arr : ArrayList<String> = ArrayList(map.keys)

        println(arr.toString())


    }
}
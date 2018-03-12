package com.example.yeongpyo.studytoandroid

import com.example.yeongpyo.studytoandroid.KOTLIN_Study.text_Study.Linkfity_study
import org.junit.Test

/**
 * Created by yeongpyo on 2018-03-12.
 */
class ExampleUnitTest_Kotlin  {
    @Test
    fun addition_isCorrect() {

        var category_1 : HashMap<String , String> = HashMap()
        category_1.put("Linkify", "test")

        var totalCategory : HashMap<String, String> = HashMap()
        totalCategory.putAll(category_1)

        print(totalCategory.get("Linkify"))


    }
}
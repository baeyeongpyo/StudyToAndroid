package com.example.yeongpyo.studytoandroid.KOTLIN_Study.Rxtest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIcall {

    fun connect() : Retrofit{
        val retrofit = Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit
    }
}
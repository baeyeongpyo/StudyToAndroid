package com.example.yeongpyo.studytoandroid.KOTLIN_Study.Rxtest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface dataInterface {

    @GET("post/{id}")
    fun getdata(@Path("id") id : String) : Call<Response>
}
package com.example.yeongpyo.studytoandroid.KOTLIN_Study.Rxtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.yeongpyo.studytoandroid.R
import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.activity_rxjava2_kotlin__testing.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import java.util.concurrent.Callable
import java.util.concurrent.Future
import java.util.concurrent.FutureTask

class RXjava2Kotlin_Testing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rxjava2_kotlin__testing)


        button.setOnClickListener {
//                    Retrofit.Builder()
//                    .baseUrl("https://api.github.com")
//                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                    .build().toString()
        }




    }
    fun arrmake() : String = "Test make"
}

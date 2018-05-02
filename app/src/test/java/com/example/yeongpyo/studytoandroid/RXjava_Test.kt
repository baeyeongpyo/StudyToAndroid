package com.example.yeongpyo.studytoandroid

import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toFlowable
import io.reactivex.rxkotlin.toObservable
import org.junit.Test
import java.util.*
import java.util.concurrent.Callable
import java.util.concurrent.atomic.AtomicInteger

class RXjava_Test {
    @Test
    fun rxjava(){
        var result : String = ""
        var firstRX : Observable<String> = Observable.just("Test Text Make")
        firstRX.subscribe{ s -> result = s}
        println(result)

        var test_Second_Make = Observable.create<String> { "makeing!" }
        var secondRX : Observable<String> = test_Second_Make
        println(secondRX)

        val list = listOf("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
        list.toObservable()
                .filter{it.length >=5}
                .subscribeBy(
                        onNext ={println(it)},
                        onError = {it.printStackTrace()},
                        onComplete = {println("Done!!")}
                )

        Observable.create<String>{ onSubscribe ->
            onSubscribe.onNext("Hello")
            onSubscribe.onComplete()
        }.subscribeBy(
                onNext = { println(it) }
        )

        Observable.just("Test", "Test2")
                .map { "$it mapTest" }
                .subscribeBy(
                        onNext = { println(it)}
                )

        var count = 0
        Observable.fromIterable(listOf("one", "two", "three", "four", "five", "six"))
                .groupBy(String::length)
                .flatMap { groupObservable ->
                    groupObservable.map { s ->
                        "Value: $s Group ${groupObservable.key}"
                    }
                }.blockingForEach { s ->
                    println(s)
                    count++
                }

        val generated = AtomicInteger()
        generateSequence { generated.incrementAndGet() }.toFlowable()
                .take(2000)
                .toList()
                .subscribe()
        println(generated)





/*

        firstRX.subscribeOn()

        firstRX.observeOn()

        firstRX.map {  }

        firstRX.doOnNext()

        firstRX.observeOn()

        firstRX.subscribe()
*/


    }



}
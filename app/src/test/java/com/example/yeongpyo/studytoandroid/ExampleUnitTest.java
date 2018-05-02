package com.example.yeongpyo.studytoandroid;

import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {

        String Text = "a b c d e";
        Observable.create(emitter -> emitter.onNext(Text))
                .flatMap( o ->  Observable.just(o))
                .toList()
                .doOnSubscribe(disposable -> System.out.println(disposable))
                .subscribe();

        Observable.fromArray(Text.split(" "))
                .flatMap( s -> Observable.just(s + "test").delay(1, TimeUnit.SECONDS))
                .toList()
                .subscribe(strings -> {
                    System.out.println(strings);
                });




    }
}
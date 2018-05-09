package com.example.yeongpyo.studytoandroid;

import org.junit.Test;

import java.util.stream.IntStream;

import io.reactivex.Observable;


public class JavaTest {
    @Test
    public void Testing(){
        String[] strings = new String[]{"a","b","c"};
        int[] ints = new int[]{1,2,3,4};

    }

    private Integer[] toIntegerArray(int[] intarray){
        return IntStream.of(intarray).boxed().toArray(Integer[]::new);
    }
}

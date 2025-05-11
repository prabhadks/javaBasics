package com.examples.functionalprogramming;

import java.util.function.Consumer;

public class ForEachBehindScreenImplementation implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

package com.examples.functionalprogramming;

import java.util.function.Function;

public class MapBehindScreenImplementation implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}

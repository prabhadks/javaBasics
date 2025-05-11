package com.examples.functionalprogramming;

import java.util.function.Predicate;

public class FilterBehindScreenImplementation implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer%2 == 0;
    }
}

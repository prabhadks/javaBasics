package com.examples.functionalprogramming;

import java.util.List;

public class FPBehindTheScreen {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,7,5,10,84,76);
        list.stream().filter(new FilterBehindScreenImplementation())
                .map(new MapBehindScreenImplementation())
                .forEach(new ForEachBehindScreenImplementation());

    }
}

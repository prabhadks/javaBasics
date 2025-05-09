package com.generics.examples;

public class SumOfOperationsGenericRunner {

    public static void main(String[] args) {
        GenericsMethodLevel genericsMethodLevel = new GenericsMethodLevel();
        SumOfOperations<Integer> intSum = new SumOfOperations<>(10, 20);

        System.out.print("Integer sum: ");
        genericsMethodLevel.printValues(intSum.add());// 30

        SumOfOperations<Double> doubleSum = new SumOfOperations<>(10.5, 20.3);
        System.out.print("Double sum: "); // 30.8
        genericsMethodLevel.printValues(doubleSum.add()); // 30.8
    }
}

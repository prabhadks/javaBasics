package com.generics.examples;

//Bounded type Generics. Type can be any classes that extends Number class. Example: Object with String data type cannot be created.
public class SumOfOperations<T extends Number> {

    private T value1;
    private T value2;

    public SumOfOperations(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    public T add() {
        if (value1 instanceof Integer) {
            Integer result = value1.intValue() + value2.intValue();
            return (T) result;
        } else if (value1 instanceof Double) {
            Double result = value1.doubleValue() + value2.doubleValue();
            return (T) result;
        } else if (value1 instanceof Long) {
            Long result = value1.longValue() + value2.longValue();
            return (T) result;
        } else if (value1 instanceof Float) {
            Float result = value1.floatValue() + value2.floatValue();
            return (T) result;
        } else if (value1 instanceof Short) {
            Short result = (short) (value1.shortValue() + value2.shortValue());
            return (T) result;
        } else if (value1 instanceof Byte) {
            Byte result = (byte) (value1.byteValue() + value2.byteValue());
            return (T) result;
        } else {
            throw new UnsupportedOperationException("Type not supported");
        }
    }
}

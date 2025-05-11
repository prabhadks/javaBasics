package com.generics.examples;

public class BaseC {

    public void method() {
        System.out.println("Inside");
    }
}

class ImplC extends BaseC implements BaseI {
    public static void main(String[] args) {
        (new ImplC()).method();
    }
}

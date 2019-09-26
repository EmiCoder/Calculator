package com.sotrust.calculator;

public class Calculator {

    public static void someMethod () {
        System.out.println("someMethod works perfectly");
    }

    public void anotherMethod () {
        System.out.println("anotherMethod works perfectly too");
    }

    public static void main(String[] args) {
        someMethod();
        Calculator calculator = new Calculator();
        calculator.anotherMethod();
        System.out.println(add(4,5));
        System.out.println(subtract(5, 2));
    }


    public static int add (int a, int b) {
        return a + b;
    }

    public static int subtract (int a, int b) {
        return a - b;
    }
}

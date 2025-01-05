package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int value) {
        return x - value;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int value) {
        return value / x;
    }

    public int sumAllOperation(int value) {
        return sum(value) + multiply(value) + minus(value) + divide(value);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(10));
        System.out.println(minus(3));
        System.out.println(calculator.multiply(10));
        System.out.println(calculator.divide(8));
        System.out.println(calculator.sumAllOperation(2));
    }
}

package com.example;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        int result = add(5,3);

        System.out.println("Addition Result: " + result);

    }
}
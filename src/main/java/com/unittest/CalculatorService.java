package com.unittest;

public class CalculatorService {

    public static int addTwoNumber(int a, int b) {
        return a + b;
    }

    public static int productTwoNumber(int a, int b) {
        return a * b;
    }

    public static int subtractTwoNumber(int a, int b) {
        return a - b;
    }

    public static int divideTwoNumber(int a, int b) {
        return a / b;
    }

    public static int SumAnyTwoNumber(int ...numbers) {
        int s=0;
        for(int n:numbers)
            s+=n;
        return s;
    }
}

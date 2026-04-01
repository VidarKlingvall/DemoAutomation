package com.klingvall.automation.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
    public double squareRoot(int a){
        return Math.sqrt(a);
    }
    public double square(int a){
        return a*a;
    }
}

package com.klingvall.automation.numberGenerator;

import com.klingvall.automation.calculator.Calculator;
import org.springframework.stereotype.Component;

@Component
public class Generator {

    private final Calculator calculator;

    public Generator(Calculator calculator){
        this.calculator = calculator;
    }

    public int generateRandomNumber(int a, int b){
        int sum = calculator.add(a, b);
        sum = sum + calculator.multiply(a, b);
        return sum; //om a och b = 5 bör svaret bli 35, 10+25.
    }
}

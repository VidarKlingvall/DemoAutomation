package com.klingvall.automation.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class TestCalculator {
    //ADDITION
    @Test
    void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 10);
        assertEquals(15, result);
    }
    //SUBTRACTION
    @Test
    void shouldSubtractTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(15, 10);
        assertEquals(5, result);
    }
    //MULTIPLICATION
    @Test
    void shouldMultiplyTwoNumbers(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 6);
        assertEquals(12, result);
    }
    // DIVISION
    @Test
    void shouldDivideTwoNumbers(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(12, 3);
        assertEquals(4, result);
    }
    @Test
    void shouldThrowExceptionWhenDividingByZero(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10,0 ));
    }
    // SQUARE ROOT
    @Test
    void shouldCalculateSquareRoot(){
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(25);
        assertEquals(5, result);
    }
}

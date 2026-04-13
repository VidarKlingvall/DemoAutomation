package com.klingvall.automation.numberGenerator;

import com.klingvall.automation.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestGenerator {

    @Mock
    private Calculator calculator;
    @InjectMocks
    private Generator generator;

    @Test
    void shouldReturnThirtyFive(){
        when(calculator.add(5,5)).thenReturn(10);
        when(calculator.multiply(5,5)).thenReturn(25);
        assertEquals(35, generator.generateRandomNumber(5, 5));
    }
}

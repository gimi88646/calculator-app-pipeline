package com.gimi.calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSum(){
        assert calculator.sum(3,2)==5 : "Sum function logic is incorrect";
    }
}

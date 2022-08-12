package com.example.calculator;

import com.example.calculator.model.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUp(){
        calculator   = new Calculator();
    }

    @Test
    void sumTest() {
        Assertions.assertEquals(10 , calculator.sum(8D,2D));
    }

    @Test
    public void numbersNullSumTest() {
        Assertions.assertThrows(NullPointerException.class,()->calculator.sum(null,1D));
    }

    @Test
    void subTest() {
        Assertions.assertEquals(1, calculator.sub(2D,1D));
    }

    @Test
    void divideTest() {
        Assertions.assertEquals(2, calculator.divide(2D,1D));
    }

    @Test
    public void divisionByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class,()->calculator.divide(0D,2D));
    }

    @Test
    void factorialTest() {
        Assertions.assertEquals(120,calculator.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        Assertions.assertEquals(10,calculator.integerToBinary(2));
    }

    @Test
    void integerToHexadecimalTest() {
        Assertions.assertEquals("a",calculator.integerToHexadecimal(10));
    }

    @Test
    void calculeDayBetweenDateTest() {
        // TODO
        LocalDate d1 = LocalDate.of(2020, 3, 15);
        LocalDate d2 = LocalDate.of(2020, 3, 19);
        Assertions.assertEquals(4,calculator.calculeDayBetweenDate(d1,d2));
    }
}
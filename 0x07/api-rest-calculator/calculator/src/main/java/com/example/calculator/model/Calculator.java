package com.example.calculator.model;

import java.time.LocalDate;
import java.time.Period;

public class Calculator {

    public Double sum(Double number1, Double number2) {
        // TODO
        if(number1 != null && number2  != null){
            return number1 + number2;
        }else {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
    }

    public Double sub(Double number1, Double number2) {
        // TODO
        if(number1 != null && number2  != null){
            return number1-number2;
        }else {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
    }

    public Double divide (Double number1, Double number2)  {
        // TODO
        if(number1 == 0 || number2 == 0){
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }else if(number1 != null && number1  != null){
            return number1/number2;
        }
        else {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
    }

    public Integer factorial(Integer factorial) {
        // TODO
        int f = 1;
        if(factorial == null){
            throw new NullPointerException("Número é obrigatório.");
        }else{
            for( int i = 2; i <= factorial; i++ )
            {
                f *= i;
            }
        }
        return f;
    }

    public Integer integerToBinary(Integer integer) {
        // TODO
        return Integer.valueOf(Integer.toBinaryString(integer));
    }

    public String integerToHexadecimal(Integer integer) {
        // TODO
        return Integer.toHexString(integer);
    }

    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
        // TODO
        return Period.between(date1, date2).getDays();
    }

}

package com.example.calculator;

import com.example.calculator.model.Calculator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    @GetMapping("/welcome")
    public String messageWelcome() {
        // TODO
        return "Bem vindo à CALCULATOR API";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        // TODO
        return Double.toString(new Calculator().sum(n1,n2)) ;
    }

    @GetMapping("/subNumbers")
    public String subNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        // TODO
        return Double.toString(new Calculator().sub(n1, n2)) ;
    }

    @GetMapping("/divideNumbers")
    public String divideNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        // TODO
        return Double.toString(new Calculator().divide(n1,n2)) ;
    }

    @GetMapping("/factorial")
    public String factorial(@RequestParam(name = "factorial") Integer factorial) {
        // TODO
        return String.valueOf(new Calculator().factorial(factorial)) ;
    }

    @GetMapping("/calculeDayBetweenDate")
    public String calculeDayBetweenDate(
            @RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
            @RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {
        // TODO
        return String.valueOf(new Calculator().calculeDayBetweenDate(localDate1,localDate2));
    }

    @GetMapping("/integerToBinary")
    public String integerToBinary(@RequestParam(name = "number1") Integer n1) {
        // TODO
        return String.valueOf(new Calculator().integerToBinary(n1));
    }

    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
        // TODO
        return String.valueOf(new Calculator().integerToHexadecimal(n1));
    }
}
package com.example.oop.primitive_types_in_depth;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {

        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "4");

        BigDecimal totalValue = calculator.calculateTotalValue(5);  // no of years
        System.out.println(totalValue);

        int i = 2;
        int j = 6;

        if (i > 2 && j++ > 6)
            System.out.println("true");

        System.out.println("&& j = " + j);

        if (i > 2 & j++ > 6)
            System.out.println("true");

        System.out.println("& j = " + j);
    }
}

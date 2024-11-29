package com.example.primitive_types_in_depth;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private final BigDecimal principle;
    private final BigDecimal interest;

    public SimpleInterestCalculator(String principle, String interest) {
        this.principle = new BigDecimal(principle);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {

        return principle
                .add(principle
                .multiply(interest)
                .multiply(new BigDecimal(noOfYears)));
    }
}

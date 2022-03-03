package com.udemy.primitive_datatype_and_alternatives.big_decimal.big_decimal;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal;
    private BigDecimal rate;


    public SimpleInterestCalculator(String principal, String rate) {
        this.principal = new BigDecimal(principal);
        this.rate = new BigDecimal(rate).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int a){
        BigDecimal totalValue = (principal.multiply(rate).multiply(new BigDecimal(a))).add(principal);
        return totalValue;
    }
}

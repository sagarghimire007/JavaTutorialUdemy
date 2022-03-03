package com.udemy.exception_handling;

class Amount {
    private String currency;
    private int amount;

    Amount(String currency , int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) {
        if (!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
        }
        this.amount = this.amount + that.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

class CurrenciesDoNotMatchException extends RuntimeException {
    CurrenciesDoNotMatchException(String s) {
        super(s);
    }
}


public class CurrenciesException {
    public static void main(String[] args) {
        Amount amount1 = new Amount("USD" , 10);
        Amount amount2 = new Amount("EUR" , 20);
        try {
            amount1.add(amount2);
            System.out.println(amount1.toString());
        } catch (CurrenciesDoNotMatchException e) {
            System.out.println(e.getMessage());
        }

    }
}

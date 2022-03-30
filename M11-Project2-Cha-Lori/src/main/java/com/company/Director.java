package com.company;

public class Director extends Crew{
    private final double royaltyPercentage = .01;

    public Director(String department) {
        super(department);
    }

    public Director(String name, double pay, double earned, String department) {
        super(name, pay, earned, department);
    }

    public double pay(double moneyEarned) {
        pay += moneyEarned * royaltyPercentage;
        return pay;
    }

}

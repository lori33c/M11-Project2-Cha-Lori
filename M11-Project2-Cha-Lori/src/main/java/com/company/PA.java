package com.company;

public class PA extends Crew {
    private double hourlyPay;

    public PA(String department, double hourlyPay) {
        super(department);
        this.hourlyPay = hourlyPay;
    }

    public PA(String name, double pay, double earned, String department, double hourlyPay) {
        super(name, pay, earned, department);
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double pay(double hours) {
        pay = hours * hourlyPay;
        return pay;
    }
}

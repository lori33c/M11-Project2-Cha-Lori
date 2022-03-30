package com.company;

public class Person {
    protected String name;
    protected double pay;
    protected double earned;

    Person() { }
    Person(String name, double pay, double earned) {
        this.name = name;
        this.pay = pay;
        this.earned = earned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getEarned() {
        return earned;
    }

    public void setEarned(double earned) {
        this.earned = earned;
    }
}

package com.company;

public class Crew extends Person {
    protected String department;

    public Crew(String department) {
        this.department = department;
    }

    public Crew(String name, double pay, double earned, String department) {
        super(name, pay, earned);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double pay() {
        earned += pay;
        return pay;
    }
}

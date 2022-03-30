package com.company;

public class Actor extends Person {
    protected String role;

    public Actor(String role) {
        this.role = role;
    }

    public Actor(String name, double pay, double earned, String role) {
        super(name, pay, earned);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

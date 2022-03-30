package com.company;
import java.util.ArrayList;

public class Movie {
    private String genre;
    private Director director;
    private ArrayList<Actor> actorList = new ArrayList<Actor>();
    private ArrayList<Crew> crewList = new ArrayList<Crew>();
    private double budget;
    private double moneySpent; //moneySpent is the pay of all the staff
    private double moneyEarned; //moneyEarned money that movie earned
    private double profit;

    public Movie(String genre, Director director, ArrayList<Actor> actorList, ArrayList<Crew> crewList, double budget, double moneySpent, double moneyEarned) {
        this.genre = genre;
        this.director = director;
        this.actorList = actorList;
        this.crewList = crewList;
        this.budget = budget;
        this.moneySpent = moneySpent;
        this.moneyEarned = moneyEarned;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(ArrayList<Actor> actorList) {
        this.actorList = actorList;
    }

    public ArrayList<Crew> getCrewList() {
        return crewList;
    }

    public void setCrewList(ArrayList<Crew> crewList) {
        this.crewList = crewList;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double calProfit() {
        profit = budget + moneyEarned - moneySpent;
        return profit;
    }

    public void Payday() {
        // Pay Actors
        for (int i = 0; i < actorList.size(); i++ ) {
            double pay = actorList.get(i).getPay();
            moneySpent += pay;
            actorList.get(i).setEarned(actorList.get(i).getEarned() + pay);
        }

        // Pay Basic Crew
        for (int i = 0; i < crewList.size(); i++ ) {
            double pay = crewList.get(i).getPay();
            moneySpent += pay;
            crewList.get(i).pay();
        }

        // Pay Director
        double dirPay = director.pay(moneyEarned);
        moneySpent += dirPay;
    }
}

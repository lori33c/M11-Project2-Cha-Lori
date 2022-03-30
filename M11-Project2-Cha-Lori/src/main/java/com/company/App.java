package com.company;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Jackie", 1000, 200);
        Crew crew1 = new Crew("Chris", 1000, 0, "production");
        Crew crew2 = new Crew("Anna", 1500, 0, "production");
        Actor actor1 = new Actor("Emma", 2000, 0, "lead");
        Actor actor2 = new Actor("Robert", 1500, 0, "supporting");
        PA pa = new PA("production", 30.0);
        Director director = new Director("production");

        ArrayList<Actor> actors = new ArrayList<Actor>();
        actors.add(actor1);
        actors.add(actor2);

        ArrayList<Crew> crew = new ArrayList<Crew>();
        crew.add(crew1);
        crew.add(crew2);
        crew.add(pa);

        Movie movie = new Movie("Horror", director, actors, crew, 100000, 81000, 2000000);
        movie.Payday();
        movie.calProfit();
        System.out.printf("Profit: $%.2f \n", movie.getProfit());
        System.out.printf("Director Pay: $%.2f \n", director.pay(movie.getProfit()));
        System.out.printf("PA Pay: $%.2f \n", pa.pay(100));
        System.out.printf("Money Spent: $%.2f", + movie.getMoneySpent());

    }
}

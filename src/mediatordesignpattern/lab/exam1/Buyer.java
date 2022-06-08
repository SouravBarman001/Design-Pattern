package mediatordesignpattern.lab.exam1;

import java.util.ArrayList;

public abstract class Buyer {
    ArrayList<Double> buyerlist = new ArrayList<Double>();
    String name;
    double price;
    Mediator mediator;

    Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(double price);
}
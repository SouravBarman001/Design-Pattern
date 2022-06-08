package mediatordesignpattern.lab.exam1;

import java.util.ArrayList;

public class AmericanBuyer extends Buyer {
    Buyer buyer;
    AuctionMediator auctionMediator;
    Mediator mediator;
     String name;
    AmericanBuyer(Mediator mediator,String name){
        super(mediator,name);
        System.out.println(name +" has been added successfully");

    }
    public String getName(){
        return this.name;
    }

    @Override
    public void bid(double price) {
         buyer.buyerlist.add(price);
    }
    public double getAprice(){
        return this.price;
    }

}

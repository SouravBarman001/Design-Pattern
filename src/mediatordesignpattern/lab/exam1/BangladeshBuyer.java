package mediatordesignpattern.lab.exam1;

public class BangladeshBuyer extends Buyer{
    Buyer buyer;
    AuctionMediator auctionMediator;
    Mediator mediator;
     String name;
    BangladeshBuyer(Mediator mediator,String name){
        super(mediator,name);
        System.out.println(name +" has been added successfully");
    }

    @Override
    public void bid(double price) {
         // this.price = price;
        buyer.buyerlist.add(price);
    }

    public double getBprice(){
        return this.price;
    }
}

package mediatordesignpattern.lab.exam1;

public class IndianBuyer extends Buyer{
    Buyer buyer;
    AuctionMediator auctionMediator;
    Mediator mediator;
     String name;

    IndianBuyer(Mediator mediator,String name){
        super(mediator,name);
        System.out.println(name +" has been added successfully");
    }

    @Override
    public void bid(double price) {
       // this.price = price;
        buyer.buyerlist.add(price);


    }
    public double getIprice(){
        return this.price;
    }

}

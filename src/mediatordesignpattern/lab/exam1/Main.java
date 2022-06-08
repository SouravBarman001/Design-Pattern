package mediatordesignpattern.lab.exam1;



public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();

        Buyer b1 = new AmericanBuyer(mediator,"Elon mask");
        Buyer b2 = new BangladeshBuyer(mediator,"Shakib Al Hasan");
        Buyer b3 = new IndianBuyer(mediator,"Virat kohli");

        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);

        b1.bid(1500);
        b2.bid(9000);
        b3.bid(6000);

        mediator.findWiner();

    }

    public static void Msg(Buyer b){
        System.out.println("The auction is over.Received by "+b.name);
    }
}

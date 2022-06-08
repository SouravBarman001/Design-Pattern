package mediatordesignpattern.lab.exam1;

import java.util.Iterator;

public class AuctionMediator implements Mediator{

    Buyer buyer;
    @Override
    public void addBuyer(Buyer buyer) {
      this.buyer = buyer;
        notifyMsg();
    }


    @Override
    public void findWiner() {

       // buyer.buyerlist.add(buyer.price);
//        int maxBid = 0;
//
//        Buyer winner = null;
//        for (Buyer b: maxBid){
//            maxBid =  b.price;
//            winner = b;
//        }
        System.out.println(buyer.buyerlist);
    }

   public void notifyMsg(){
        Main.Msg(this.buyer);
   }
}

package observer.design.pattern.smartphone.dealer.example;

public class StoreOne implements ObserverStore{
    @Override
    public void update(Message m) {
        System.out.println("StoreOne:"+m.getMessage());
    }
}

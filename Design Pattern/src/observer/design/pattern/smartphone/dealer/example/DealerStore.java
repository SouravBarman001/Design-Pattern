package observer.design.pattern.smartphone.dealer.example;


public interface DealerStore {
    public void attach(ObserverStore o);
    public void detach(ObserverStore o);
    public void notifyUpdate(Message m);
}

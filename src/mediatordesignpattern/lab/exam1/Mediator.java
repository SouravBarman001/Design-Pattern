package mediatordesignpattern.lab.exam1;

public interface Mediator {
    Buyer buyer = null;
    public void addBuyer(Buyer buyer);
    public void findWiner();
}

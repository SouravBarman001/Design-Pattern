package structural.designpattern.example.pattern.decorator.designpattern;

public class Main {
    public static void main(String[] args)
    {
        IceCream iceCream = new Vanilla();
        iceCream = new Chocolate(new Nuts(new Chocolate(iceCream)));
        iceCream.getPrice();
        iceCream.getType();
    }
}
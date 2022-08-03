package creational.designpattern.pattern.factory.design.factory2;

public class Home implements Building{
    @Override
    public void build() {
        System.out.println("Make a Home");
    }
}

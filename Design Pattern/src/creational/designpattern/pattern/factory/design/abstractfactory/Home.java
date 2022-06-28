package creational.designpattern.pattern.factory.design.abstractfactory;

public class Home implements Building{
    @Override
    public void build() {
        System.out.println("Make Home");
    }
}

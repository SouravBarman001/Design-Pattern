package creational.designpattern.pattern.factory.design.abstractfactory;

public class House1 implements Building{
    @Override
    public void build() {
        System.out.println("Make House");
    }
}

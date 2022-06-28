package creational.designpattern.pattern.factory.design.abstractfactory;

public class Hut implements Building{
    @Override
    public void build() {
        System.out.println("Make Hut");
    }
}

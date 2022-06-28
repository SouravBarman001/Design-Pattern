package creational.designpattern.pattern.factory.design.abstractfactory;

public class Berger implements PaintCompany{
    @Override
    public void paint() {
        System.out.println("Berger paint company");
    }
}

package creational.designpattern.pattern.factory.design.abstractfactory;

public class Asian implements PaintCompany{
    @Override
    public void paint() {
        System.out.println("Asian paint company");
    }
}

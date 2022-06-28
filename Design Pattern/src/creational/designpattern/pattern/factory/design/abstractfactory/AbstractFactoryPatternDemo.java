package creational.designpattern.pattern.factory.design.abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
         AbstractFactory abstractFactory = FactoryProducer.getFactory("building");
         Building building1 = abstractFactory.getBuilding("home");
         building1.build();


        AbstractFactory abstractFactory2 = FactoryProducer.getFactory("paint");
        PaintCompany paintCompany = abstractFactory2.getPaintCompany("berger");
        paintCompany.paint();


    }


}

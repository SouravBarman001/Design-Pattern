package creational.designpattern.pattern.factory.design.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String abstractFactory){
    if(abstractFactory != null){
        if ("building".equalsIgnoreCase(abstractFactory)){
            return new BuildingFactory();
        }
        if ("paint".equalsIgnoreCase(abstractFactory)){
            return new PaintFactory();
        }
    }
        return null;
    }
}

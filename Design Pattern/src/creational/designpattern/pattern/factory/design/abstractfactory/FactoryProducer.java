package creational.designpattern.pattern.factory.design.abstractfactory;

import creational.designpattern.pattern.factory.design.factory2.BuildingFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String producer1){
        if (producer1 != null){
            if ("building".equalsIgnoreCase(producer1)){
                return new ();
            }

        }
        return null;
    }
}

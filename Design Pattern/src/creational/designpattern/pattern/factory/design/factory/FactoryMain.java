package creational.designpattern.pattern.factory.design.factory;

public class FactoryMain {
    public static void main(String[] args) {

        // hide the implementation of classes
        // factory returns the instance of the class

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS obj = operatingSystemFactory.getInstance("closed");
        obj.spec();
    }
}

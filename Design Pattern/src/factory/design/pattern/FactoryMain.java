package factory.design.pattern;

public class FactoryMain {
    public static void main(String[] args) {

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS obj = operatingSystemFactory.getInstance("closed");
        obj.spec();
    }
}

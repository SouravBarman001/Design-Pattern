package structural.designpattern.example.pattern.bridge.pattern;

public class Bus extends Automobile{
    protected Bus(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void menufacture() {
        System.out.print("Bus is ");
        workshop1.work();
        workshop2.work();
    }
}

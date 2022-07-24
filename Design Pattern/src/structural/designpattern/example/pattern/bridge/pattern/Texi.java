package structural.designpattern.example.pattern.bridge.pattern;

public class Texi extends Automobile{
    protected Texi(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void menufacture() {
        System.out.print("Texi is ");
        workshop1.work();
        workshop2.work();
    }
}

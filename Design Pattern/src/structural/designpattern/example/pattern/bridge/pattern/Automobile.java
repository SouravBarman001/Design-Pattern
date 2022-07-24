package structural.designpattern.example.pattern.bridge.pattern;

public abstract class Automobile {
    protected Workshop workshop1;
    protected Workshop workshop2;

    protected Automobile(Workshop workshop1,Workshop workshop2){
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }
    abstract public void menufacture();
}

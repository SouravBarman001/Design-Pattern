package structural.designpattern.example.pattern.bridge.pattern;

public class User {
    public static void main(String[] args) {

        Automobile bus = new Bus(new Produce(),new Assemble());
        bus.menufacture();
    }
}

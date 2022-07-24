package structural.designpattern.example.pattern.bridge.pattern;

public class Assemble implements Workshop{
    @Override
    public void work() {
        System.out.print(" and assembled ");
    }
}

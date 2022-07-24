package structural.designpattern.example.pattern.bridge.pattern;


public class Produce implements Workshop{
    @Override
    public void work() {
        System.out.print("Produce");
    }
}

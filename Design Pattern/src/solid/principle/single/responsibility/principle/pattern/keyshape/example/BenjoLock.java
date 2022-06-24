package solid.principle.single.responsibility.principle.pattern.keyshape.example;

public class BenjoLock implements KeyInterface{
    @Override
    public void setLock(String name) {
        System.out.println("BenjoLock Operation using : "+name);
    }
}

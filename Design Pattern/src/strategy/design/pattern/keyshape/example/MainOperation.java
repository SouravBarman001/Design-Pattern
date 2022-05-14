package strategy.design.pattern.keyshape.example;

public class MainOperation {
    public static void main(String[] args) {

        Context context = new Context();
        context.setLockSystem(new BenjoLock());
        context.keyShape("BenjoShape");



        context.setLockSystem(new PadLock());
        context.keyShape("PadShape");


    }
}

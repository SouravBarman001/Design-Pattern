package labexamthree.questionTwo;

public class CycleRiding {
    public static void main(String[] args) {





        Component bell=new LeafComponent(50,"Bell");
        Component tube=new LeafComponent(60,"Tube");
        Component spoke=new LeafComponent(20,"Spoke");


        Composite wheel = new Composite("Wheel");
        Composite cycle = new Composite("Cycle");

        wheel.addComponent(tube);
        wheel.addComponent(spoke);

        cycle.addComponent(bell);
        cycle.addComponent(wheel);

        cycle.showComponentAndPrice();




     //   Component tyre = new LeafComponent(200,"Tyre");
//        Component tube = new LeafComponent(250,"Tube");
//        Component spoke = new LeafComponent(350,"Spoke");
//        Component bell = new LeafComponent(100,"Bell");
//
//
//        Composite wheel = new Composite("Wheel");
//        Composite Cycle = new Composite("Cycle");
//        Composite tyre = new Composite("Tyre");
//        Composite breakk = new Composite("Break");
//
//        breakk.addComponent(bell);
//        tyre.addComponent(spoke);
//
//
//        wheel.addComponent(tyre);
//        wheel.addComponent(tube);
//
//        Cycle.addComponent(wheel);
//        Cycle.addComponent(breakk);
//
//        Cycle.showComponentAndPrice();



    }
}

package structural.designpattern.example.pattern.composit.design;

public class MainMethod {
    public static void main(String[] args) {
         Component hdd = new Leaf(3000,"HDD");
         Component mouse = new Leaf(250,"Mouse");
        Component monitor = new Leaf(55000,"Monitor");
        Component ram = new Leaf(4000,"Ram");
        Component cpu = new Leaf(9000,"Cpu");

        Composite peri = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Motherboard");
        Composite pc = new Composite("Computer");

        peri.addComponent(mouse);
        peri.addComponent(monitor);

        mb.addComponent(ram);
        mb.addComponent(cpu);


        cabinet.addComponent(mb);
        cabinet.addComponent(hdd);

        pc.addComponent(cabinet);
        pc.addComponent(peri);

         cabinet.showPrice();

    }
}

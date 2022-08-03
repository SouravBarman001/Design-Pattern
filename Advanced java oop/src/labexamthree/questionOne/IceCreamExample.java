package labexamthree.questionOne;

interface IceCream{
    public int price();
    public String decoratedItems();
}


class VanillaIceCream implements IceCream{


    @Override
    public int price() {
        return 30;
    }

    @Override
    public String decoratedItems() {
        return "Vanilla";
    }
}

class StrawberryIceCream implements IceCream
{

    @Override
    public int price() {
        return 50;
    }

    @Override
    public String decoratedItems() {
        return "Strawberry";
    }
}

abstract class IceCream_Decorates implements IceCream{
     protected IceCream iceCream;
    IceCream_Decorates(IceCream iceCream){
        this.iceCream =iceCream;
    }

    public int price() {
        return iceCream.price();
    }

    public String decoratedItems() {
        return "Strawberry";
    }

    public abstract String addItems();
}

class ChocolateDecorates extends IceCream_Decorates{

    ChocolateDecorates(IceCream iceCream) {
        super(iceCream);
    }
    public int price() {
        return 100;
    }
    @Override
    public String addItems() {
        return "adding Chocolate";
    }
}

class NutsDecorates extends IceCream_Decorates{

    NutsDecorates(IceCream iceCream) {
        super(iceCream);
    }
    public int price() {
        return 80;
    }
    @Override
    public String addItems() {
        return "adding Nuts";
    }
}

public class IceCreamExample {
    public static void main(String[] args) {
        IceCream vanilla = new VanillaIceCream();
        IceCream_Decorates chocolate = new ChocolateDecorates(new NutsDecorates(vanilla));
        IceCream_Decorates  nuts = new NutsDecorates(vanilla);


        System.out.println("Vanilla-Ice-cream");
        System.out.println("Price:"+chocolate.price());
        System.out.println("Decorated items:"+chocolate.decoratedItems());
        System.out.println("------------------------");

        System.out.println("Vanilla-Ice-cream");
        System.out.println("Price:"+nuts.price());
        System.out.println("Decorated items:"+nuts.decoratedItems());
    }
}

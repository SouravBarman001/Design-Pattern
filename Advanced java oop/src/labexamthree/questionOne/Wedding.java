package labexamthree.questionOne;

// interface pizza


public interface Wedding {
    String room();
    String decoratedItems();
}

class GuestRoom implements Wedding {

    @Override
    public String room() {
        return "Guest";
    }

    @Override
    public String decoratedItems() {
        return "light ";
    }
}

class NormalRoom implements Wedding {

    @Override
    public String room() {
        return "Normal";
    }

    @Override
    public String decoratedItems() {
        return "Showcase";
    }
}

abstract class Alif_Decorator implements Wedding {
    protected Wedding weddingDecorator;

    public Alif_Decorator(Wedding weddingDecorator) {
        this.weddingDecorator = weddingDecorator;
    }

    public String decoratedItems() {
        return weddingDecorator.decoratedItems() + " and "+addItems();
    }
    public String room(){

        return weddingDecorator.room();
    }
    public abstract String addItems();

}

class GuestRoomDecorator extends Alif_Decorator {

    public GuestRoomDecorator(Wedding weddingDecorator) {
        super(weddingDecorator);
    }

    @Override

    public String addItems(){
        return " showcase , furniture and flower";
    }

}

class NormalRoomDecorator extends Alif_Decorator {

    public NormalRoomDecorator(Wedding weddingDecorator) {
        super(weddingDecorator);
    }

    @Override
    public String addItems(){
        return " flower";
    }

}
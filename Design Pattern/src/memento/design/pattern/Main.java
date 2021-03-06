package memento.design.pattern;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setArticle("State 1");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("State 2");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("State 3");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);
        originator.restore(careTaker.undo());
        printState(originator);

        originator.restore(careTaker.redo());
        printState(originator);
        originator.restore(careTaker.redo());
        printState(originator);
        originator.restore(careTaker.redo());
        printState(originator);


//        originator.restore(careTaker.redo());
//        printState(originator);
    }

    public static void printState(Originator o){
        System.out.println("Current state: "+o.getArticle());
    }
}

package memento.design.pattern.editor.example;

public class Editor {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setArticle("this is state one");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("this is state two");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.setArticle("this is state three");
        careTaker.addMemento(originator.save());
        printState(originator);

        originator.restore(careTaker.undo());
        printState(originator);


        originator.restore(careTaker.redo());
        printState(originator);
    }

    public static void printState(Originator o){
        System.out.println(o.getArticle());
    }
}

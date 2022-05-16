package memento.design.pattern.editor.example;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> history;
    int currentState = -1;

    CareTaker(){
        this.history = new ArrayList<Memento>();
    }

    public void addMemento(Memento o){
        this.history.add(o);
        currentState = this.history.size() - 1;
    }

    // It's just working in the inner class and functions
    public Memento getMemento(int o){
        return history.get(o);
    }

    public Memento undo(){
        System.out.println("undoing state......");
        if(currentState <= 0){
            currentState = 0;
            return getMemento(currentState);
        }
        currentState --;
       return getMemento(currentState);
    }
    public Memento redo(){
        System.out.println("redoing state....");

        if (currentState >= history.size() -1){
            currentState = history.size() - 1;
            return getMemento(currentState);
        }
        currentState ++;
        return getMemento(currentState);
    }

}

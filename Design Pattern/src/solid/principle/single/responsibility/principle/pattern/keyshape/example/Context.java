package solid.principle.single.responsibility.principle.pattern.keyshape.example;

public class Context {

    KeyInterface key;

    public void setLockSystem(KeyInterface key){
        this.key = key;

    }

    public void keyShape(String name){
        key.setLock(name);
    }

}

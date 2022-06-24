package solid.principle.single.responsibility.principle.pattern.keyshape.example;

public class PadLock implements KeyInterface{
    private boolean isLock;

    @Override
    public void setLock(String name) {
        System.out.println("PadLock operation using : "+name);
    }

    public void padLocked(){
        this.isLock = true;
    }

    public void padUnlocked(){
        this.isLock = false;
    }

    public String toString(){
        return "Locked: "+isLock;
    }
}

package strategy_design_pattern;

interface Change{
    public void changePedi();
}
class VegBurger implements Change{

    @Override
    public void changePedi() {
        System.out.println("Veg burger");
    }
}

class ChickenBurger implements Change{
    @Override
    public void changePedi() {
        System.out.println("Chicken burger");
    }
}

class Context{
    Change change;
    void setChange(Change c){
        this.change = c;
    }
    void Call(){
        change.changePedi();
    }

}


public class Test {
    public static void main(String[] args) {
       Context obj = new Context();
       obj.setChange(new VegBurger());
       obj.Call();
    }
}

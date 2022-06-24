package solid.principle.single.responsibility.principle.pattern.burger.example;

// Context

public class Context {
    //String name;

    BurgerInterface burgerInterface; // chickenburger

    Context(BurgerInterface newBurgerInterface){
        this.burgerInterface = newBurgerInterface;

    }
//
//    public void setRecipe(BurgerInterface newBurgerInterface) // new ChickenBurger()
//    {
//        this.burgerInterface = newBurgerInterface;
//    }



    public void pediName(String name) //
    {
        burgerInterface.changePedi(name);
    }
}

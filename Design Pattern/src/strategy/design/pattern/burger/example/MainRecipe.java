package strategy.design.pattern.burger.example;


public class MainRecipe {
    BurgerInterface burgerInterface;

    public void setRecipe(BurgerInterface newBurgerInterface)
    {
        this.burgerInterface = newBurgerInterface;
    }
    public void pediChange(String name){
        burgerInterface.changePedi(name);
    }
}

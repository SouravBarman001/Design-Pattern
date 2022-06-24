package solid.principle.single.responsibility.principle.pattern.burger.example;

public class ChickenBurger implements BurgerInterface {

    @Override
    public void changePedi(String burgerName)
    {
        System.out.println("Your " +burgerName+" is ready");
    }
}

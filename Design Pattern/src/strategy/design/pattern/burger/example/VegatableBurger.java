package strategy.design.pattern.burger.example;

public class VegatableBurger implements BurgerInterface{
    @Override
    public void changePedi(String burgerName) {
        System.out.println("Your "+burgerName+ " is ready");
    }

}

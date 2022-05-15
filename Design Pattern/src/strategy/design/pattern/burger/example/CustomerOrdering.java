package strategy.design.pattern.burger.example;

public class CustomerOrdering {
    public static void main(String[] args) {
        MainRecipe mainRecipe = new MainRecipe();
        mainRecipe.setRecipe(new ChickenBurger());
        mainRecipe.pediChange("Chicken burger");

        mainRecipe.setRecipe(new VegatableBurger());
        mainRecipe.pediChange("Vegatable Burger");
    }
}

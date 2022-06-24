package solid.principle.single.responsibility.principle.pattern.burger.example;

public class MainMethod {
    public static void main(String[] args) {
        Context context = new Context(new VegatableBurger());
      //  context.setRecipe(new VegatableBurger());
        context.pediName("Vegatable burger");
    }
}

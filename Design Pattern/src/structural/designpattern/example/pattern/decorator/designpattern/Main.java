package structural.designpattern.example.pattern.decorator.designpattern;

public class Main {
    public static void main(String[] args)
    {
        Pizza vegPizza = new VegPizza();
        Pizza nonVegPizza = new NonVegPizza();
        SubstanceDecorator cheesePizza = new CheeseDecorator(new VegPizza());
        SubstanceDecorator chickenPizza = new ChickenDecorator(new NonVegPizza());
        System.out.println("Normal Veg Pizza");
        System.out.println("size: " + vegPizza.size());
        System.out.println("ingredients: " + vegPizza.ingredient());
        System.out.println("Checken: " + chickenPizza.ingredient());

//        System.out.println();
//        System.out.println("Normal Non Veg Pizza");
//        System.out.println("size: " + nonVegPizza.size());
//        System.out.println("ingredients: " + nonVegPizza.ingredient());
//        System.out.println();
//        System.out.println("Veg Pizza after adding Cheese");
//        System.out.println("size: " + cheesePizza.size());
//        System.out.println("ingredients: " + cheesePizza.ingredient());
//        System.out.println();
//        System.out.println("Non Veg Pizza after adding Chicken");
//        System.out.println("size: " + chickenPizza.size());
//        System.out.println("ingredients: " + chickenPizza.ingredient());
//        System.out.println();

    }
}
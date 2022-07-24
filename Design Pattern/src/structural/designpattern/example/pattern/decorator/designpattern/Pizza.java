package structural.designpattern.example.pattern.decorator.designpattern;

public interface Pizza {
    String size();
    String ingredient();
}

class VegPizza implements Pizza{

    @Override
    public String size() {
        return "medium";
    }

    @Override
    public String ingredient() {
        return "vegetable";
    }
}

class NonVegPizza implements Pizza{

    @Override
    public String size() {
        return "Big";
    }

    @Override
    public String ingredient() {
        return "Mutton";
    }
}

abstract class SubstanceDecorator implements Pizza{
    protected Pizza pizzaDecorator;

    public SubstanceDecorator(Pizza pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
    }

    public String size(){

      return pizzaDecorator.size();
  }
    public String ingredient(){
       return pizzaDecorator.ingredient();
    }
}

class ChickenDecorator extends SubstanceDecorator{

    public ChickenDecorator(Pizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public String ingredient() {
        return pizzaDecorator.ingredient() + " and "+addChicken();
    }

    private String addChicken(){
        return " Add chicken to Pizza";
    }

}

class CheeseDecorator extends SubstanceDecorator{

    public CheeseDecorator(Pizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public String ingredient() {
        return pizzaDecorator.ingredient() + " and "+addCheese();
    }

    private String addCheese(){
        return " Add Cheese to Pizza";
    }

}
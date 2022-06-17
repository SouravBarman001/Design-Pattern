package smartphone.design.pattern.observer;

public class Main {
   public static void main(String[] args) {
      Shop shop1 = new Shop();
      shop1.setColor(Color.Blue);
     // System.out.println(shop1.getColor());
      shop1.setCategory(Category.Clothing);
      Shop shop2 = shop1;
    //  Shop shop2 = new Shop();
      shop2.setColor(Color.Red);

      shop1.setColor(Color.Black);

      shop2.setCategory(Category.Grocery);
     // System.out.println(shop2.getColor());
      System.out.println(shop1);
      System.out.println(shop2);
   }

}

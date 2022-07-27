package labexamthree.questionTwo;

public class LeafComponent implements Component{
   private int price;
   private String name;

    public LeafComponent(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public void showComponentAndPrice() {
        System.out.println(name +" : "+price);

    }
}

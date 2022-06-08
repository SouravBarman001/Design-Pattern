package smartphone.design.pattern.observer;

enum Category{
    Toy,
    Grocery,
    Jewellery,
    Clothing
};
enum Color{
    Blue,
    Green,
    Black,
    Red
};

public class Shop {

       String ID;
       int number;
       int floor;
       private Category category;
       private Color col;

       public void setCategory(Category cat){
       this.category = cat;
      }
      public void setColor(Color color){
           this.col = color;
      }
       public Category getCategory(){
             return category;
       }
       public Color getColor(){
              return col;
       }

    @Override
    public String toString() {
        return "Shop{" +
                "ID='" + ID + '\'' +
                ", number=" + number +
                ", floor=" + floor +
                ", category=" + category +
                ", col=" + col +
                '}';
    }
}

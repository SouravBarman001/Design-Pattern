package basic.oop;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12 , 13);
        System.out.println(rectangle);
        System.out.println("------------");
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println(rectangle);
        System.out.println("=========");
        System.out.println(rectangle.area());
    }
}

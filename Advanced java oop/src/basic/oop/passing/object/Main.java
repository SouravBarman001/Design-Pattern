package basic.oop.passing.object;


public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3,8);
        Point p2 = new Point(80,21);

        System.out.println(p1);
        System.out.println(p2);
        double result =  p1.findDistance(p2);

        System.out.println(result);

        System.out.println(p1);
        System.out.println(p2);
    }
}

package basic.oop.interfaceExample;

interface Polygon{
    void getArea(int length, int width);
}


public class SimpleExample implements  Polygon{

    @Override
    public void getArea(int length, int width) {
        System.out.println("Area : "+ (length*width));
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
     example.getArea(5,10);

    }
}

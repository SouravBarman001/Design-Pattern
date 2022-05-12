package basic.oop.passing.object;

public class Point {
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double findDistance(Point p2)
    {
          double d = Math.sqrt(Math.pow((p2.x - this.x),2) + Math.pow((p2.y - this.y),2));
          p2.x = 90;
          return d;
    }

    public String toString(){
        return String.format("point : [%d] [%d]",x,y);
    }
}

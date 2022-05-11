package basic.oop;

public class Rectangle {
    // state
    private  int length;
    private int width;

    // creation
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    // operations
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    public int getWidth(){
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }


   public double area(){
       return length * width;
   }

   public int perimeter(){
        return 2*(length+width);
   }

    public String toString(){
      return String.format("length : %d\n width : %d\n area : %.2f\n perimeter : %d\n",length,width,area(),perimeter());
    }
}

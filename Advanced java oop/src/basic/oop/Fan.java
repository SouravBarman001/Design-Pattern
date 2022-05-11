package basic.oop;

public class Fan {
    // state

    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed; // 1 to 5

    // creation
    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void switchOn(){
        this.isOn = true;
        setSpeed((byte) 2);
    }
    public void switchOff(){
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }
    public String toString(){
       return String.format("make - %s, radius - %f, color - %s, speed - %d,isOn - %b",make,radius,color,speed,isOn);
    }

}


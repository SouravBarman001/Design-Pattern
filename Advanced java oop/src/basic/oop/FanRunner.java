package basic.oop;

public class FanRunner {
    public static void main(String[] args) {

        Fan fan = new Fan("Phillips",0.34567,"Green");
        System.out.println(fan);
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte) 5);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}

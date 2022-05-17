package basic.oop.method.overloading;

public class Test {

    public static void main(String[] args) {
        System.out.println("main");

        Test t = new Test();
        t.main(2);
    }

    public static void main(int a) {
        System.out.println("2nd main");
    }
}
//Yes, we can overload java mani method....
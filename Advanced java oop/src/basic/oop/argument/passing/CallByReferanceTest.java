package basic.oop.argument.passing;

public class CallByReferanceTest {
    public static void main(String[] args) {
        CallByReferance obj = new CallByReferance();
        obj.name = "puspom";

        System.out.println("before : "+obj.name);

        obj.change(obj);
        System.out.println("after :"+obj.name);
    }


}

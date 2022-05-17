package basic.oop.method.overloading;

public class ClassA {
    int a;
    int show(){
        System.out.println("method one");
        return 1;
    }
    int show(int a){
        System.out.println("method two :"+a);
        return 2;
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        int a =obj.show();
        System.out.println(a);
    }
}

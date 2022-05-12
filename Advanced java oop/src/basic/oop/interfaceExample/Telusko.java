package basic.oop.interfaceExample;

/*
   3 types of interface

   1. Marker interface -> without any method
   2. SAM - > Single abstract method || Functional interface
   3. Normal
 */

import java.sql.SQLOutput;

interface ABC{

    // every method in interface is public abstract
    // we can not create an instance of an interface

    public void show();
}

class ABCImp implements ABC{


    @Override
    public void show() {
        System.out.println("in show");
    }
}

public class Telusko {
    public static void main(String[] args) {
      ABC obj = new ABCImp();
//      obj.show();
//        ABC obj = ()->{
//            System.out.println("in show");
//        };
        obj.show();
    }
}

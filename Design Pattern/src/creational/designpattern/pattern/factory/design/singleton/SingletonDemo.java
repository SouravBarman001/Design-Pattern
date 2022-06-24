package creational.designpattern.pattern.factory.design.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        ABC obj = ABC.getInstance();
        ABC obj1 = ABC.getInstance();

    }
}

 class ABC{
    public static ABC obj;
    int i;
    private ABC(){
        System.out.println("Instance Created");
    }
    public static ABC getInstance(){

        if (obj == null){
            obj = new ABC();
        }
       return obj;

    }

}

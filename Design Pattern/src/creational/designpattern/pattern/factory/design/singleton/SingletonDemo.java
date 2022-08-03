package creational.designpattern.pattern.factory.design.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
       ProsantoAccount accountProsanto = ProsantoAccount.getInstance(10);
       ProsantoAccount accountProsanto2 = ProsantoAccount.getInstance(20);

        //ABC prosanto = ABC.getInstance(20);
    }
}
 class ProsantoAccount{
    public static ProsantoAccount obj;
    int i;
    private ProsantoAccount(int a){

        // database logic
        int money = 90;
        int result = money + a; // 90 - 20 = 70

        System.out.println("Instance Created");
        System.out.println(result);
    }
    public static ProsantoAccount getInstance(int a){

        if (obj == null){
            obj = new ProsantoAccount(a);
        }
       return obj;

    }

}

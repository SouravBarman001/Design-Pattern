package structural.designpattern.example.pattern.facade.designpattern;
// Practically, every Abstract Factory is a type of Facade.

import java.util.Scanner;

interface MobileShop{
    public void modelNo();
    public void price();
}

class Iphone implements MobileShop{

    @Override
    public void modelNo() {
        System.out.println("iphone 12");
    }

    @Override
    public void price() {
        System.out.println("1 lakh");

    }
}

class Samsung implements MobileShop{

    @Override
    public void modelNo() {
        System.out.println("Galaxy S20");

    }

    @Override
    public void price() {
        System.out.println("1.15 lakh");

    }
}

class Xiaomi implements MobileShop{

    @Override
    public void modelNo() {
        System.out.println("Redmi note 10");

    }

    @Override
    public void price() {
        System.out.println("22k");
    }
}

class ShopKeeper{

    private Iphone iphone;
    private  Samsung samsung;
    private Xiaomi xiaomi;

    ShopKeeper(){
        iphone = new Iphone();
        samsung = new Samsung();
        xiaomi = new Xiaomi();
    }

    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
    public void xiaomiSale(){
        xiaomi.modelNo();
        xiaomi.price();
    }

}




public class FacadePatternClient {
    public static void main(String[] args) {

        int option;

            System.out.println("1. Iphone");
            System.out.println("2. Samsung");
            System.out.println("3. Xiaomi");
           // System.out.println("3. exit");
             Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            ShopKeeper shopKeeper = new ShopKeeper();

        switch (option){
                case 1 :
                    shopKeeper.iphoneSale();
                    break;
                case 2:
                    shopKeeper.samsungSale();
                    break;
                  case 3:
                     shopKeeper.xiaomiSale();
                     break;
            default:
                System.out.println("select 1 ,2 or 3");
               // exit();
            }
    }
}

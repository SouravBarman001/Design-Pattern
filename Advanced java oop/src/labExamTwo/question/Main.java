package labExamTwo.question;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
      
      
        System.out.println("Enter Delivery type : ");
        Scanner input=new Scanner(System.in);
         String str=input.nextLine();
         OperationSystemFactory ob=new OperationSystemFactory();
         DeliveryCharge obj=ob.getInstance(str);
         obj.Charge();
        
        ComputerPart com = new Computer();
        com.accept(new ComputerPartDisplayVisitor());
        
     
      
    }
}

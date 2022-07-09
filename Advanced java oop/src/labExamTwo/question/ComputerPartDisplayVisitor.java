package labExamTwo.question;
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

     @Override
   public void visit(Computer computer) {
      System.out.println(" ");
   }

   @Override
   public void visit(Mouse mouse) {
      System.out.println("Order for Mouse.");
   }

   @Override
   public void visit(Keyboard keyboard) {
      System.out.println("Order Keyboard.");
   }

   @Override
   public void visit(Printer printer) {
      System.out.println("Order Printer.");
   }
    
}

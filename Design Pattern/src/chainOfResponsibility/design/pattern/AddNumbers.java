package chainOfResponsibility.design.pattern;

public class AddNumbers implements Chain{

    public Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
      this.nextInChain = nextChain;
    }

    @Override
    public void calculation(Numbers request) {
             if (request.getCalculationWanted() == "add"){
                 System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " +(request.getNumber1()+request.getNumber2()));
             }
             else {
                 nextInChain.calculation(request);
             }
    }
}

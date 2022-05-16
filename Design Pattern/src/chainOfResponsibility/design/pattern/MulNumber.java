package chainOfResponsibility.design.pattern;

public class MulNumber implements Chain{

    public Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculation(Numbers request) {
        if (request.getCalculationWanted() == "mul"){
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " +(request.getNumber1()*request.getNumber2()));
        }
        else {
            System.out.println("you can only use add,sub and mul");
        }
    }
}


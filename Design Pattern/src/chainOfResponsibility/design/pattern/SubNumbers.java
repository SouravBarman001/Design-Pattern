package chainOfResponsibility.design.pattern;

public class SubNumbers implements Chain{
    public Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculation(Numbers request) {
        if (request.getCalculationWanted() == "sub"){
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " +(request.getNumber1() - request.getNumber2()));
        }
        else {
            nextInChain.calculation(request);
        }
    }
}

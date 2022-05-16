package chainOfResponsibility.design.pattern;

public interface Chain {

    public void setNextChain(Chain nextChain);
    public void calculation(Numbers request);
}

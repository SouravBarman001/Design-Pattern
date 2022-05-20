package chainofresponsibility.deign.pattern.lab.exam1;

public interface  EmailProcessor{

    public void setNextChain(EmailProcessor nextChain);
    public void processEmail(Email priority);
}

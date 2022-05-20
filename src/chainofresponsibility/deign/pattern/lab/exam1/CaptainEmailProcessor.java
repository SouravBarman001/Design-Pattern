package chainofresponsibility.deign.pattern.lab.exam1;

public class CaptainEmailProcessor implements EmailProcessor{
    EmailProcessor nextEmailProcessor;


    @Override
    public void setNextChain(EmailProcessor nextChain) {
        this.nextEmailProcessor = nextChain;
    }

    @Override
    public void processEmail(Email priority) {
        if(priority.getPriority()==1){
            System.out.println("Email is "+priority.getId()+" by captain");
        }
        else {
            System.out.println("Email "+priority.getId()+" cannot be processed");

        }
    }
}

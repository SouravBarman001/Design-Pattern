package chainofresponsibility.deign.pattern.lab.exam1;

public class BoardEmailProcessor implements EmailProcessor{
    EmailProcessor nextEmailProcessor;


    @Override
    public void setNextChain(EmailProcessor nextChain) {
        this.nextEmailProcessor = nextChain;
    }

    @Override
    public void processEmail(Email priority) {
            if(priority.getPriority()==1){
                System.out.println("Email is "+priority.getId()+" by board");
               // nextEmailProcessor.processEmail(priority);
            }
            else if (priority.getPriority() == 5){
                System.out.println("Email is "+priority.getId()+" by board");
              //  nextEmailProcessor.processEmail(priority);
            }
            else if (priority.getPriority()== 10){
                System.out.println("Email is "+priority.getId()+" by board");
              //  nextEmailProcessor.processEmail(priority);
            }

    }
}

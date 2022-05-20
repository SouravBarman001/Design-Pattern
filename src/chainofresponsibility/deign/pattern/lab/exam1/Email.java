package chainofresponsibility.deign.pattern.lab.exam1;

public class Email {
    private int id;
    private String message;
    private int priority;

    Email(int id,String message,int newPriority){
        this.id = id;
        this.message = message;
         this.priority= newPriority;
    }

    public int getId(){return id;}
    public String getMessage(){return message;}
    public int getPriority(){return priority;}

}

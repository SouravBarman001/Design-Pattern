package observer.design.pattern.smartphone.dealer.example;

public class Message {
    final String MessageContent;
    public Message(String newMessage){
        this.MessageContent = newMessage;
    }

    public String getMessage(){
        return MessageContent;

    }
}

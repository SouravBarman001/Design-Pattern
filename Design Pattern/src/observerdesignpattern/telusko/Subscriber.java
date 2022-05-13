package observerdesignpattern.telusko;

public class Subscriber {

     String name;
    private Channel channel = new Channel();

    Subscriber(String name){
        this.name = name;
    }

    public void update(){
        System.out.println(name+" - video uploaded ,"+channel.title);
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}

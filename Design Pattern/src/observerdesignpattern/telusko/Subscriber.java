package observerdesignpattern.telusko;

public class Subscriber implements Observer {

     String name;
    private Channel channel = new Channel();

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println(name+" - video uploaded ,"+channel.title);
    }

    @Override
    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}

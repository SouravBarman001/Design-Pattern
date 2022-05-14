package command.design.pattern;

public class SetTopBox {
    public void on(){
        System.out.println("SetTopBox is On");
    }
    public void off(){
        System.out.println("SetTopBox is Off");
    }
    public void setChannel(int defaultChannel){
        System.out.println("SetTopBox is set to channel: "+defaultChannel);
    }
    public void setVolume(int volume){
        System.out.println("SetTopBox volume is set to : "+volume);
    }
}

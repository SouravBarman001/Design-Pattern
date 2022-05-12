package strategy.design.pattern.socialmedia.example;

public class SocialMediaContext {
    SocialMediaStrategy smStrategy;

    public void setSocialMediaStrategy(SocialMediaStrategy smStrategy){
        this.smStrategy = smStrategy;
    }

    public void connect(String name){
        smStrategy.connectTo(name);
    }
}

package strategy.design.pattern.socialmedia.example;

public class TwitterStrategy implements SocialMediaStrategy{
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting with "+ friendName + " through twitter");

    }
}

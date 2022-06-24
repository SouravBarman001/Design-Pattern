package solid.principle.single.responsibility.principle.pattern.socialmedia.example;

public class Main {
    public static void main(String[] args) {

        SocialMediaContext context = new SocialMediaContext();

        context.setSocialMediaStrategy(new FacebookStrategy());
        context.connect("Sourav");

        context.setSocialMediaStrategy(new TwitterStrategy());
        context.connect("Puspom");

    }

}

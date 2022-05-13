package observerdesignpattern.telusko;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}

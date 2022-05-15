package observerdesignpattern.telusko;

public interface Subject {
    void subscribe(Subscriber sub);
    void unSubscribe(Subscriber sub);
    void notifySubscribers();
    void upload(String title);
}

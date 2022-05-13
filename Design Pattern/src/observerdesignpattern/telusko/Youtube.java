package observerdesignpattern.telusko;

public class Youtube {
    public static void main(String[] args) {
        Channel telusko = new Channel();

        Subscriber s1 = new Subscriber("Sourav");
        Subscriber s2 = new Subscriber("Rana");

        Subscriber s3 = new Subscriber("Razu");

        Subscriber s4 = new Subscriber("Polash");

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);

        telusko.unSubscribe(s2);

        s1.subscribeChannel(telusko);
        s2.subscribeChannel(telusko);
        s3.subscribeChannel(telusko);
        //s4.subscribeChannel(telusko);


        telusko.upload("how to learn programming");
    }
}

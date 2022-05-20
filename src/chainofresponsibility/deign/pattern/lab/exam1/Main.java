package chainofresponsibility.deign.pattern.lab.exam1;

public class Main {
    public static void main(String[] args) {


        EmailProcessor c1 = new BoardEmailProcessor();
        EmailProcessor c2 = new CoachEmailProcessor();
        EmailProcessor c3 = new CaptainEmailProcessor();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        Email a = new Email(121,"Who is the opener batsman?",Priority.low);
        Email b = new Email(123,"What will we choose after winning the toss?",Priority.Medium);
        Email c = new Email(125,"Will Bangladesh participate in the Srilanka series?",Priority.High);


        c1.processEmail(a);
        c1.processEmail(b);
        c1.processEmail(c);

        c2.processEmail(a);
        c2.processEmail(b);
        c2.processEmail(c);

        c3.processEmail(a);
        c3.processEmail(b);
        c3.processEmail(c);
    }

}

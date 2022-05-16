package chainOfResponsibility.design.pattern;

public class Main {
    public static void main(String[] args) {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new SubNumbers();
        Chain chainCal3 = new MulNumber();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);

        Numbers request = new Numbers(2,5,"sub");
       // chainCal1.calculation(request);
        chainCal2.calculation(request);
    }
}

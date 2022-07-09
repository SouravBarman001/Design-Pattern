package labExamTwo.questionone.factory2;

public class Printer implements MakingProduct {
    @Override
    public void build() {
        System.out.println("Make a Printer");
    }
}

package labExamTwo.questionone.factory2;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        TechFactory techFactory = new TechFactory();
        MakingProduct makingProduct = techFactory.getBuilding("mouse");
        makingProduct.build();


    }
}

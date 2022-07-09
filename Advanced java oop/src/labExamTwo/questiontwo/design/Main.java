package labExamTwo.questiontwo.design;

public class Main {
    public static void main(String[] args) {

        File f1 = new FileBuilder().setAlgo1("sorting").setAlgo2("bubblesort").getFile();
        System.out.println(f1);

        //   File f1 = new File("bubble",null,null,null,null,null);

    }
}

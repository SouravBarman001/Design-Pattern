package labExamTwo.questiontwo.design;

public class FileBuilder implements Prototype{
    private String algo1;
    private String algo2;
    private String algo3;
    private String algo4;
    private String algo5;
    private String algo6;


    public FileBuilder setAlgo1(String algo1) {
        this.algo1 = algo1;
        return this;
    }

    public FileBuilder setAlgo2(String algo2) {
        this.algo2 = algo2;
        return this;
    }

    public FileBuilder setAlgo3(String algo3) {
        this.algo3 = algo3;
        return this;
    }

    public FileBuilder setAlgo4(String algo4) {
        this.algo4 = algo4;
        return this;
    }

    public FileBuilder setAlgo5(String algo5) {
        this.algo5 = algo5;
        return this;
    }

    public FileBuilder setAlgo6(String algo6) {
        this.algo6 = algo6;
        return this;
    }
    public File getFile(){
        return new File(algo1,algo2,algo3,algo4,algo5,algo6);
    }

    @Override
    public File copy() {
        return new File(algo1,algo2,algo3,algo4,algo5,algo6);
    }
}

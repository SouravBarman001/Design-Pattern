package labExamTwo.questiontwo.design;

public class File {

    private String algo1;
    private String algo2;
    private String algo3;
    private String algo4;
    private String algo5;
    private String algo6;


    public File(String algo1, String algo2, String algo3, String algo4, String algo5, String algo6) {
        this.algo1 = algo1;
        this.algo2 = algo2;
        this.algo3 = algo3;
        this.algo4 = algo4;
        this.algo5 = algo5;
        this.algo6 = algo6;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "algo1='" + algo1 + '\'' +
                ", algo2='" + algo2 + '\'' +
                ", algo3='" + algo3 + '\'' +
                ", algo4='" + algo4 + '\'' +
                ", algo5='" + algo5 + '\'' +
                ", algo6='" + algo6 + '\'' +
                '}';
    }
}

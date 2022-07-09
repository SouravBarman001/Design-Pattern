package template.pattern;

public class Cricket extends Game{
    @Override
    public void initialization() {
        System.out.println("Toss done");
    }

    @Override
    public void startPlay() {
        System.out.println("start playing");
    }

    @Override
    public void endPlay() {
        System.out.println("end playing");

    }
}

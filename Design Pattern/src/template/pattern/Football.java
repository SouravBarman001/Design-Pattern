package template.pattern;

public class Football extends Game{
    @Override
    public void initialization() {
        System.out.println("players are in the field");
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

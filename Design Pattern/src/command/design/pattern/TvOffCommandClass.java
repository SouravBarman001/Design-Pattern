package command.design.pattern;

public class TvOffCommandClass implements Command{
    Tv tv;

    public TvOffCommandClass(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}

package command.design.pattern;

public class TvOnCommandClass implements Command{
    Tv tv;

    public TvOnCommandClass(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}

package template.pattern;

public abstract class Game {

    public final void play(){
        initialization();
        startPlay();
        endPlay();
    }
    public abstract void initialization();
    public abstract void startPlay();
    public abstract void endPlay();
    }



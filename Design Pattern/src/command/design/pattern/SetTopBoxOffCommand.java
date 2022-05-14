package command.design.pattern;

public class SetTopBoxOffCommand implements Command{
    SetTopBox setTopBox;

    public SetTopBoxOffCommand(SetTopBox newSetTopBox){
        this.setTopBox = newSetTopBox;
    }

    @Override
    public void execute() {
        setTopBox.off();
    }
}

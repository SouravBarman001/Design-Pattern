package command.design.pattern;

public class SetTopBoxOnCommand implements Command{

    SetTopBox setTopBox;

    public SetTopBoxOnCommand(SetTopBox newSetTopBox){
        this.setTopBox = newSetTopBox;
    }

    @Override
    public void execute() {
        setTopBox.on();
        setTopBox.setChannel(122);
        setTopBox.setVolume(111);
    }
}

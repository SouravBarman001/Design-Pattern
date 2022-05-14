package command.design.pattern;

public class User {
    public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();
    SetTopBox setTopBox = new SetTopBox();

    remoteControl.setCommand(new SetTopBoxOnCommand(setTopBox));
    remoteControl.pressButton();

        remoteControl.setCommand(new SetTopBoxOffCommand(setTopBox));
        remoteControl.pressButton();

        Tv newTv = new Tv();
        remoteControl.setCommand(new TvOnCommandClass(newTv));
        remoteControl.pressButton();

    }
}
/*
* https://www.youtube.com/watch?v=Wis6pXZ-xxw
* */
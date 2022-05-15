package command.design.pattern.home.automation;

public class HomeAutomation {
    ICommand command;
    public void setCommand(ICommand command){
        this.command = command;
    }

    public void buttonPresed(){
        command.execute();
    }
}

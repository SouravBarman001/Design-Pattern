package command.design.pattern.home.automation;

public class LightOff implements ICommand{

    Light light;

    LightOff(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning off light.");

        light.lightOff();
    }
}

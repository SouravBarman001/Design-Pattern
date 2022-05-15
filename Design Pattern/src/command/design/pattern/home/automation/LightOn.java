package command.design.pattern.home.automation;

public class LightOn implements ICommand{
    Light light;
    LightOn(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning on light.");
        light.Onlight();
    }
}

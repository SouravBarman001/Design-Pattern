package command.design.pattern.airconditionar.example;


public class Main
{
    public static void main(String[] args)
    {
        AirCondition ac1 = new AirCondition();
        AirCondition ac2 = new AirCondition();

        Remote remote = new Remote();
        remote.setCommand(new TogglePower(ac1));
        remote.run();
        remote.setCommand(new IncreaseTemperature(ac1));
        remote.run();
        remote.run();
        remote.run();
        System.out.println(ac1);


        remote.addCommand(new TogglePower(ac2));
        remote.addCommand(new IncreaseTemperature(ac2));
        remote.addCommand(new IncreaseTemperature(ac2));
        remote.addCommand(new IncreaseTemperature(ac2));
        remote.addCommand(new IncreaseTemperature(ac2));
        remote.addCommand(new IncreaseTemperature(ac2));
        remote.addCommand(new IncreaseTemperature(ac2));
        remote.addCommand(new IncreaseTemperature(ac2));
        remote.addCommand(new IncreaseTemperature(ac2));
        remote.runAll();
        System.out.println(ac2);
    }
}
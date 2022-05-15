package command.design.pattern.home.automation;

public class Main {
    public static void main(String[] args) {
        Light light = new Light("Bed room");
        HomeAutomation homeAutomation = new HomeAutomation();
        homeAutomation.setCommand(new LightOn(light));
        homeAutomation.buttonPresed();

        homeAutomation.setCommand(new LightOff(light));
        homeAutomation.buttonPresed();
    }
}

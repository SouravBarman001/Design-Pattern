package command.design.pattern.home.automation;

public class Light {
    String LightName;
    Light(String m){
        this.LightName = m;

    }
    public void Onlight(){
        System.out.println(LightName+" Light is On...");
    }

    public void lightOff(){
        System.out.println(LightName+" Light is off...");
    }
}

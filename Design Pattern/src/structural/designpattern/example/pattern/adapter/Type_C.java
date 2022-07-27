package structural.designpattern.example.pattern.adapter;

public class Type_C {
    ChargerPin chargerPin;
    public void setChargerPin( ChargerPin p){
        this.chargerPin = p;

    }
    public ChargerPin getChargerPin(){
      return chargerPin;

    }
    public void sendMsg(String type,String str){
        chargerPin.pinOn(type,str);
    }
}

package structural.designpattern.example.pattern.adapter;

public class MainMethod {
    public static void main(String[] args) {
        Type_C obj = new Type_C();
        ChargerPin chargerPin = new OTGAdapterPin();
        obj.setChargerPin(chargerPin);
        obj.sendMsg("pendrive","Phone is conneted to ");
    }
}

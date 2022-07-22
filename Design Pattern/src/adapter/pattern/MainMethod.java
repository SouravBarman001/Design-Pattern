package adapter.pattern;

public class MainMethod {
    public static void main(String[] args) {
        Type_B obj = new Type_B();
        ChargerPin chargerPin = new AdapterPin();
        obj.setChargerPin(chargerPin);
        obj.sendMsg("otg","Phone is conneted to ");
    }
}

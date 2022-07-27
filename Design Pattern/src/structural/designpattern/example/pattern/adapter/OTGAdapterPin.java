package structural.designpattern.example.pattern.adapter;

public class OTGAdapterPin implements ChargerPin{
    Headphone headphone = new Headphone();
    PenDrive penDrive = new PenDrive();
    @Override
    public void pinOn(String type,String msg) {

        if (type.equalsIgnoreCase("headphone")){
            headphone.pinConnected(msg);
        }

        if (type.equalsIgnoreCase("pendrive")){
            penDrive.pinConnected(msg);
        }
        else {
            System.out.println("Please set the right type of the pin");
        }
    }
}

package structural.designpattern.example.pattern.adapter;

public class AdapterPin implements ChargerPin{
    Type_C type_c = new Type_C();
    OTG otg = new OTG();
    @Override
    public void pinOn(String type,String msg) {

        if (type.equalsIgnoreCase("type-c")){
            type_c.pinConnected(msg);
        }

        if (type.equalsIgnoreCase("otg")){
            otg.pinConnected(msg);
        }
        else {
            System.out.println("Please set the right type of the pin");
        }
    }
}

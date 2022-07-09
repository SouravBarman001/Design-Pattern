package creational.designpattern.pattern.factory.design.factory2;

public class BuildingFactory {
    public Building getBuilding(String building1) {
        if (building1 != null){
            if ("home".equalsIgnoreCase(building1)){
                return new Printer();
            }
            if ("house".equalsIgnoreCase(building1)){
                return new Keyboard();
            }
            if ("hut".equalsIgnoreCase(building1)){
                return new Mouse();
            }
        }
        return null;
    }
}

package creational.designpattern.pattern.factory.design.factory2;

public class BuildingFactory {
    public Building getBuilding(String building1) {
        if (building1 != null){
            if ("home".equalsIgnoreCase(building1)){
                return new Home();
            }
            if ("house".equalsIgnoreCase(building1)){
                return new House();
            }
            if ("hut".equalsIgnoreCase(building1)){
                return new Hut();
            }
        }
        return null;
    }
}

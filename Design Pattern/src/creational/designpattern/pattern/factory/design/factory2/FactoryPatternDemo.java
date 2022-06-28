package creational.designpattern.pattern.factory.design.factory2;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        BuildingFactory buildingFactory = new BuildingFactory();
        Building building = buildingFactory.getBuilding("house");
        building.build();


    }
}

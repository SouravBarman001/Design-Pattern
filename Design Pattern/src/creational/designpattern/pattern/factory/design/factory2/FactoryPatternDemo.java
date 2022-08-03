package creational.designpattern.pattern.factory.design.factory2;

public class FactoryPatternDemo {
    public static void main(String[] args) {

       BuildingFactory buildingFactory = new BuildingFactory();
        Building obj =  buildingFactory.getBuilding("hut"); //new Hut();
        obj.build();


//        Building obj = new Home();
//        obj.build();

        Building obj1 = new Hut();
        obj1.build();



//        Building building = buildingFactory.getBuilding("house");
      //  building.build();


    }
}

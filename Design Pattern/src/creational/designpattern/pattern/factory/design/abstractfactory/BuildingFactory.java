package creational.designpattern.pattern.factory.design.abstractfactory;

public class BuildingFactory extends AbstractFactory {
    public Building getBuilding(String building1) {
        if (building1 != null){
            if ("home".equalsIgnoreCase(building1)){
                return new Home();
            }
            if ("house".equalsIgnoreCase(building1)){
                return new House1();
            }
            if ("hut".equalsIgnoreCase(building1)){
                return new Hut();
            }
        }
        return null;
    }

    @Override
    PaintCompany getPaintCompany(String paintType) {
        return null;
    }
}

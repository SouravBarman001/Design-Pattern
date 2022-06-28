package creational.designpattern.pattern.factory.design.abstractfactory;

public class PaintFactory extends AbstractFactory {



    @Override
   public PaintCompany getPaintCompany(String paintType) {
        if (paintType != null){
            if ("asian".equalsIgnoreCase(paintType)){
                return new Asian();
            }
            if ("berger".equalsIgnoreCase(paintType)){
                return new Berger();
            }

        }
        return null;
    }
    @Override
    Building getBuilding(String buildingType) {
        return null;
    }
}

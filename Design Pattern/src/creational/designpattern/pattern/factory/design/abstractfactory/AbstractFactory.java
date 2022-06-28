package creational.designpattern.pattern.factory.design.abstractfactory;

public abstract class AbstractFactory {
    abstract Building getBuilding(String buildingType);
    abstract PaintCompany getPaintCompany(String paintType);
    }

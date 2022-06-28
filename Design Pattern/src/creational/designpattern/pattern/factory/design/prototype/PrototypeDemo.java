package creational.designpattern.pattern.factory.design.prototype;
public class PrototypeDemo {
    public static void main(String[] args){
        EmployeeRecord e1=new EmployeeRecord();
        e1.setId(1200);
        e1.setAddress("nk");
        e1.setDesignation("std");
        e1.setName("sourav");
        e1.setSalary(12.22);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.setName("razu");
        e2.showRecord();
    }
}

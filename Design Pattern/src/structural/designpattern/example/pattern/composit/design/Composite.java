package structural.designpattern.example.pattern.composit.design;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
      String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super();
        this.name = name;
    }

    public void addComponent(Component com){
        components.add(com);
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c: components){
            c.showPrice();
        }
    }
}

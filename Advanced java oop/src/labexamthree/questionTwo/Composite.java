package labexamthree.questionTwo;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

   private String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super();
        this.name = name;
    }

    public void addComponent(Component com){
        components.add(com);
    }
    @Override
    public void showComponentAndPrice() {
        System.out.println(name);
        for(Component c: components){
            c.showComponentAndPrice();
        }
    }
}

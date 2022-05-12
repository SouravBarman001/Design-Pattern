package basic.oop.argument.passing;

public class CallByReferance {
    String name;

    void change(CallByReferance p){
        p.name = "sourav";
    }
}

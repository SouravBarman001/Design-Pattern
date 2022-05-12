package basic.oop.argument.passing;

class Printer{
    public void print(Paper p){
        p.setText("Bye");
    }

}


class Paper{
    String text;

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}

public class PlayingWithObject {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.setText("hello");
        System.out.println("Before : "+paper.getText());

        Printer printer = new Printer();
        printer.print(paper);
        System.out.println("After : "+paper.getText());

    }
}

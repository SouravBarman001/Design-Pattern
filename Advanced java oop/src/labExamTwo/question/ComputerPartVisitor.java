
package labExamTwo.question;
public interface ComputerPartVisitor {
    public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Printer monitor);
}

package practice.java.oopsconcept;

public interface InterFaceA {
void add();
void subtract();
void divide();
}
abstract class ImplementsA implements InterFaceA{
	abstract void multiply();
}
interface InterfaceB{
	void addition();
}
class ImplementB implements InterFaceA,InterfaceB {
	public void addition() {}
	public void add() {}
	public void subtract() {}
	public void divide() {}
}
package practice.java.oopsconcept;

public abstract class AbstractClass {
	abstract void getBrowser(); // this method van be overridden in another class
	// ABstraction  > Method overriding > inheritance
	// when implementation is present then its and concrete method
	public void add() {
		
	}
	abstract class Chrome extends AbstractClass{
		void getBrowser() {
			System.out.println("Open Chrome");
		}
	}
	abstract class Firefox extends AbstractClass{
		void getBrowser() {
			System.out.println("Open Firefox");
		}
	}
}

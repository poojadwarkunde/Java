package practice.java.constructorr;

public class CopyConstructor {
	int age;
	String name;

	CopyConstructor(int age, String name) {
		this.age = age;
		this.name = name;
	}

	CopyConstructor(CopyConstructor cc1) {// or c can be written instead of cc1 
		age = cc1.age;
		name = cc1.name;
	}

	void printAgeName() {
		System.out.println("My Age : " + age + " My name :" + name);
	}

	public static void main(String[] args) {
		CopyConstructor cc1 = new CopyConstructor(28, "mahesh");
		CopyConstructor cc2 = new CopyConstructor(cc1);
		cc1.printAgeName();
		cc2.printAgeName();
	}
}

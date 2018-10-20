package practice.java.constructorr;

public class ParametrizedConstructor {
	int age;
	String name;

	/*
	 * Parametrized constructor is used to provide different values to the
	 * distinct objects
	 */
	public ParametrizedConstructor(int a, String name) {
		// this.age = age;
		age = a;
		this.name = name;
		// "this" means reference to same class; this can be avoided when
		// parameter local and global variable names are different ; this work
		// only on global variable
	}

	public ParametrizedConstructor() {
		this.age = 20;
	}

	public ParametrizedConstructor(int a) {
		age = a;
	}

	void printAgeName() {
		System.out.println("My Age : " + age + " My name :" + name);
	}

	public static void main(String[] args) {
		ParametrizedConstructor p = new ParametrizedConstructor(28, "mahesh");
		p = new ParametrizedConstructor(34, "Nilesh");
		p = new ParametrizedConstructor();
		p.printAgeName();
	}
}

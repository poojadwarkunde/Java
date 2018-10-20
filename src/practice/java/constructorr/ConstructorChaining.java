package practice.java.constructorr;

public class ConstructorChaining {
	int a;

	ConstructorChaining(int a) {
		System.out.println("In Constructor Chaining");
		this.a = a;
	}
}

class Child extends ConstructorChaining {
	int b;

	Child(int a, int b) {
		// ConstructorChaining c = new ConstructorChaining(a);
		super(a); // 8 sets here ConstructorChaining(a);
		//super is keyword which help you to refer parent class
		this.b = b; // 9 sets here
		//super(a); // this statement will give error msg as " Constructor call must be the first statement in constructor
	}

	void show() {
		System.out.println("Grand Parent's a = " + a);
		System.out.println("Parent's b = " + b);
	}
}

class abc {
	public static void main(String[] args) {
		Child object = new Child(8,9);
		object.show();
	}
}
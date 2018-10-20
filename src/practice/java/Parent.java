package practice.java;

import java.io.IOException;

public class Parent {
	public void method1() throws MyParentException {
		System.out.println(" Parent method 1");
		throw new MyParentException();
	}
	public static void method2() {
		System.out.println("Parent static Method 2");
	}
	
	public static void main(String[] args) throws Throwable {
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		//Child cp = (Child)new Parent();
//		p.method1();
//		c.method1();
//		pc.method1();
		p.method2();
		c.method2();
		pc.method2();
	}
}

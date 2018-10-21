package practice.java.exceptions;

import practice.java.generic.Parent;

public class Child extends Parent{
	public void method1() throws MyChildException{
		System.out.println(" Child method 1");
		throw new MyChildException();
	}
	public static void method2() {
		System.out.println("child static Method 2");
	}
}
